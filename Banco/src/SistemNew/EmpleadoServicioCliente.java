/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemNew;

import java.io.*;
import java.net.*;

public class EmpleadoServicioCliente {
    private static final String HOST = "localhost";
    private static final int PORT = 12345;

    public static void main(String[] args) {
        try (Socket socket = new Socket(HOST, PORT);
             ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream in = new ObjectInputStream(socket.getInputStream())) {

            out.writeObject("employee");
            out.writeObject("servicio al cliente");

            String ticket = (String) in.readObject();
            System.out.println("Atendiendo ticket: " + ticket);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

