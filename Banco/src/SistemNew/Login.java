/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemNew;
import java.io.*;
import java.util.*;

public class Login {
  private static final String USERS_FILE = "users.txt";
    private static Map<String, String> users = new HashMap<>();
    private static Map<String, String> roles = new HashMap<>();

    public static void main(String[] args) {
        loadUsers();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (authenticate(username, password)) {
            Usuario user = new Usuario(username, roles.get(username));
            redirectUser(user);
        } else {
            System.out.println("Invalid credentials.");
        }

        scanner.close();
    }

    private static void loadUsers() {
        try (BufferedReader reader = new BufferedReader(new FileReader(USERS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                String username = parts[0];
                String password = parts[1];
                String role = parts[0].split("_")[0]; // Extract role from username
                users.put(username, password);
                roles.put(username, role);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean authenticate(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }

    private static void redirectUser(Usuario user) {
        switch (user.getRole()) {
            case "client":
                Cliente.main(new String[0]);
                break;
            case "employee":
                if (user.getUsername().contains("caja")) {
                    EmpleadoCaja.main(new String[0]);
                } else if (user.getUsername().contains("servicio")) {
                    EmpleadoServicioCliente.main(new String[0]);
                }
                break;
            default:
                System.out.println("Unknown role.");
        }
    }
}
