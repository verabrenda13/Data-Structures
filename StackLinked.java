package Assignment;

// A class to represent a node of the linked list
class Node {
    // The value stored in the node
    int value;
    // The reference to the next node
    Node next;
  
    // A constructor to create a new node with a given value
    Node(int value) {
      this.value = value;
      this.next = null;
    }
  }
class Stack {
  // The reference to the head of the linked list
  Node head;

  // A constructor to create an empty stack
  Stack() {
    this.head = null;
  }

  // A method to check if the stack is empty
  boolean isEmpty() {
    return head == null;
  }

  // A method to push a value to the top of the stack
  void push(int value) {
    // Create a new node with the given value
    Node newNode = new Node(value);
    // Make the new node point to the current head of the list
    newNode.next = head;
    // Make the new node the new head of the list
    head = newNode;
  }

  // A method to pop a value from the top of the stack
  int pop() {
    // Check if the stack is empty
    if (isEmpty()) {
      // Throw an exception
      throw new RuntimeException("Stack is empty");
    }
    // Store the value of the current head of the list
    int value = head.value;
    // Make the next node the new head of the list
    head = head.next;
    // Return the value
    return value;
  }

  // A method to peek the value at the top of the stack
  int display() {
    // Check if the stack is empty
    if (isEmpty()) {
      // Throw an exception
      throw new RuntimeException("Stack is empty");
    }
    // Return the value of the current head of the list
    return head.value;
  }

public static void main(String[] args) {



  Stack stack = new Stack();
  //Adding elements
  stack.push(1);
  stack.push(2);

  stack.pop();
  System.out.println("Top element of stack: " + stack.display());

    
}
}




