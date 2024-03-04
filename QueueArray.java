package Assignment;

// A class to represent a queue using an array
class Queue {
    // The array to store the elements of the queue
    int[] array;
    // The size of the array
    int size;
    // The index of the front element of the queue
    int front;
    // The index of the rear element of the queue
    int rear;
  
    // A constructor to create a queue with a given size
    Queue(int size) {
      this.size = size;
      this.array = new int[size];
      this.front = -1;
      this.rear = -1;
    }
  
    // A method to check if the queue is empty
    boolean isEmpty() {
      return front == -1;
    }
  
    // A method to check if the queue is full
    boolean isFull() {
      return (rear + 1) % size == front;
    }
  
    // A method to add an element to the rear of the queue
    void enqueue(int element) {
      // Check if the queue is full
      if (isFull()) {
        System.out.println("Queue is full!");
        return;
      }
      // If the queue is empty, set the front and rear to 0
      if (isEmpty()) {
        front = 0;
        rear = 0;
      } else {
        // Increment the rear index and wrap around if necessary
        rear = (rear + 1) % size;
      }
      // Insert the element to the rear of the queue
      array[rear] = element;
    }
  
    // A method to remove an element from the front of the queue
    int dequeue() {
      // Check if the queue is empty
      if (isEmpty()) {
        throw new RuntimeException("Queue is empty");
      }
      // Store the element at the front of the queue
      int element = array[front];
      // If the queue has only one element, set the front and rear to -1
      if (front == rear) {
        front = -1;
        rear = -1;
      } else {
        // Increment the front index and wrap around if necessary
        front = (front + 1) % size;
      }
      // Return the element
      return element;
    }
  
    // A method to peek the element at the front of the queue
    int peek() {
      // Check if the queue is empty
      if (isEmpty()) {
        throw new RuntimeException("Queue is empty");
      }
      // Return the element at the front of the queue
      return array[front];
    }
  }
  
