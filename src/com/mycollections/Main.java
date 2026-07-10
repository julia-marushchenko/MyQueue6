/**
 *  Java program to do operations on ArrayDeque.
 */

package com.mycollections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an instance of Q
        Queue queue = new ArrayDeque();

        // Adding elements to the queue.
        queue.offer(11.6);
        queue.offer(10);
        queue.offer(12.7);
        queue.offer(13);
        queue.offer(15.0);
        queue.offer(14);
        queue.offer(17);
        queue.offer("String");
        queue.offer(16);
        queue.offer(18);
        queue.offer(20);

        // Printing elements of the queue to console.
        System.out.println("Queue: " + queue); // Output: Queue: [11.6, 10, 12.7, 13, 15.0, 14, 17, String, 16, 18, 20]

        // Showing head element of the queue.
        System.out.println("Head of the queue: " + queue.peek()); // Output: Head of the queue: 11.6

        // Removing an element from the queue.
        queue.poll();
        // Printing elements of the queue to console.
        System.out.println("Queue: " + queue); // Output: Queue: [10, 12.7, 13, 15.0, 14, 17, String, 16, 18, 20]

        // Showing head element of the queue.
        System.out.println("Head of the queue: " + queue.peek()); // Output: Head of the queue: 10

    }
}