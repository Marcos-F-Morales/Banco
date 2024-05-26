/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemNew;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
    private Queue<Ticket> queue = new LinkedList<>();
    private final int capacity;

    public Buffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(Ticket ticket) throws InterruptedException {
        while (queue.size() == capacity) {
            wait();
        }
        queue.add(ticket);
        notifyAll();
    }

    public synchronized Ticket consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        Ticket ticket = queue.poll();
        notifyAll();
        return ticket;
    }
}
