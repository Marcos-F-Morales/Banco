/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemNew;

/**
 *
 * @author f3rma
 */
public class Ticket {
     private static int counter = 0;
    private int id;
    private String serviceType;

    public Ticket(String serviceType) {
        this.id = ++counter;
        this.serviceType = serviceType;
    }

    public int getId() {
        return id;
    }

    public String getServiceType() {
        return serviceType;
    }

    @Override
    public String toString() {
        return "Ticket [ID=" + id + ", ServiceType=" + serviceType + "]";
    }
}
