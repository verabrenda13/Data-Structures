
package datastructures;
import java.util.ArrayList;


public class DataStructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Stack
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack:");
        System.out.println("Size: " + stack.size());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek after pop: " + stack.peek());

        // Queue
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("\nQueue:");
        System.out.println("Size: " + queue.size());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Peek after dequeue: " + queue.peek());

        // Array
        Array array = new Array(5);
        array.set(0, 10);
        array.set(1, 20);
        array.set(3, 30);

        System.out.println("\nArray:");
        System.out.println("Index 1: " + array.get(1));
        System.out.println("Index 2: " + array.get(2));
        System.out.println("Index 3: " + array.get(3));

        // Linked List
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.prepend(0);
        linkedList.append(3);

        System.out.println("\nLinked List:");
        linkedList.display();
    }
}
    

// Linked List
class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void delete(int data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

// Array
class Array {
    private final int size;
    private final int[] items;

    public Array(int size) {
        this.size = size;
        this.items = new int[size];
    }

    public void set(int index, int item) {
        if (index >= 0 && index < size) {
            items[index] = item;
        } else {
            System.out.println("Index out of range");
        }
    }

    public int get(int index) {
        if (index >= 0 && index < size) {
            return items[index];
        } else {
            System.out.println("Index out of range");
            return -1; // Or throw an exception
        }
    }
}

// Node class for Linked List
class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Queue
class Queue {
    private final ArrayList<Integer> items;

    public Queue() {
        this.items = new ArrayList<>();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void enqueue(int item) {
        items.add(item);
    }

    public int dequeue() {
        if (!isEmpty()) {
            return items.remove(0);
        } else {
            System.out.println("Queue is empty");
            return -1; // Or throw an exception
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return items.get(0);
        } else {
            System.out.println("Queue is empty");
            return -1; // Or throw an exception
        }
    }

    public int size() {
        return items.size();
    }
}

// Stack
class Stack {
    private final ArrayList<Integer> items;

    public Stack() {
        this.items = new ArrayList<>();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void push(int item) {
        items.add(item);
    }

    public int pop() {
        if (!isEmpty()) {
            return items.remove(items.size() - 1);
        } else {
            System.out.println("Stack is empty");
            return -1; // Or throw an exception
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return items.get(items.size() - 1);
        } else {
            System.out.println("Stack is empty");
            return -1; // Or throw an exception
        }
    }

    public int size() {
        return items.size();
    }
}
