/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemNew;


import java.io.*;
import java.net.*;
import java.util.concurrent.*;

public class Servidor {
    private static final int PORT = 12345;
    private static final int CAPACITY = 10;
    private static Buffer bufferCaja = new Buffer(CAPACITY);
    private static Buffer bufferServicioCliente = new Buffer(CAPACITY);
    private static int ticketCounter = 0;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Servidor iniciado...");

            while (true) {
                Socket socket = serverSocket.accept();
                executor.execute(new ClientHandler(socket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class ClientHandler implements Runnable {
        private Socket socket;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try (ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                 ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream())) {

                String role = (String) in.readObject();

                if (role.equals("client")) {
                    String serviceType = (String) in.readObject();
                    String ticket = generateTicket(serviceType);
                    if (serviceType.equals("caja")) {
                        bufferCaja.produce(ticket);
                    } else {
                        bufferServicioCliente.produce(ticket);
                    }
                    out.writeObject(ticket);
                } else if (role.equals("employee")) {
                    String serviceType = (String) in.readObject();
                    String ticket;
                    if (serviceType.equals("caja")) {
                        ticket = bufferCaja.consume();
                    } else {
                        ticket = bufferServicioCliente.consume();
                    }
                    out.writeObject(ticket);
                }

            } catch (IOException | ClassNotFoundException | InterruptedException e) {
                e.printStackTrace();
            }
        }

        private synchronized String generateTicket(String serviceType) {
            ticketCounter++;
            return "Ticket-" + serviceType + "-" + ticketCounter;
        }
    }
}
