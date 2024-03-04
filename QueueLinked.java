package Assignment;

//import java.util.EmptyStackException;
import java.util.Scanner;
// Implementation of a queue using linked list
class QueueLinked {
    class Node {
        //Data field
        int data;
        //Address field
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front, rear;

    public QueueLinked() {
        front = rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }
    

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if (isEmpty()) {
            //throw new EmptyStackExceptio();
            throw new IllegalStateException("Queue is Empty");

        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    public int display() {
        if (isEmpty()) {
            //throw new EmptyStackException();
            throw new IllegalStateException("Queue is empty");

        }
        return front.data;
    }
        public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        

        // Testing queue
        QueueLinked queue = new QueueLinked();
        
        queue.enqueue(0);
        queue.enqueue(0);
        queue.enqueue(0);

        System.out.println("Front element of queue: " + queue.display());

        System.out.println("Dequeued element from queue: " + queue.dequeue());

        System.out.println("Front element of queue after dequeue: " + queue.display());
    }

}

