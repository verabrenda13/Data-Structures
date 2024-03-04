package Assignment;

import java.util.PriorityQueue;
public class priorityQ {
public static void main(String[] args) {
PriorityQueue<Integer> pq = new PriorityQueue<>();

// Add some elements to the queue
pq.add(10);
pq.add(5);
pq.add(15);
pq.add(20);
pq.add(1);

// Peek the element with the highest priority (the smallest element)
System.out.println(pq.peek()); // 1

// Remove and return the element with the highest priority
System.out.println(pq.poll()); // 1

// Peek the element with the next highest priority
System.out.println(pq.peek()); // 5

// Remove and return the element with the next highest priority
System.out.println(pq.poll()); // 5

// Check the size of the queue
System.out.println(pq.size()); // 3
    
}
    



}
