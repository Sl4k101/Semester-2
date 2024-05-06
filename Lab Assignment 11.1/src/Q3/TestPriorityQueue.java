package Q3;

import java.util.*;

public class TestPriorityQueue {
    public static void main(String[] args) {
        // Create a PriorityQueue using Comparable (natural order)
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add("New York"); 
        pq1.add("Atlanta"); 
        pq1.add("Dallas"); 
        pq1.add("Madison");
        pq1.addAll(Arrays.asList(7, 1, 5, 3, 6, 2, 4));

        System.out.println("PriorityQueue using Comparable:");
        while (!pq1.isEmpty()) {
            System.out.println(pq1.poll());
        }

        // Create a PriorityQueue using Comparator (reverse order)
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        pq2.addAll(Arrays.asList(7, 1, 5, 3, 6, 2, 4));

        System.out.println("\nPriorityQueue using Comparator:");
        while (!pq2.isEmpty()) {
            System.out.println(pq2.poll());
        }
    }
}