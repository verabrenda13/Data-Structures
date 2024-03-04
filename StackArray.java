package Assignment;
import java.util.EmptyStackException;

// Implementation of a stack using arrays
class StackArray {
    //the array
    private int[] array;
    //top element
    private int top;
    //size
    private int size;

    public StackArray(int capacity) {
        size = capacity;
        array = new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        array[++top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return array[top--];
    }

    public int display() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return array[top];
    }
 public static void main(String[] args) {

 // Testing stack
 StackArray stack = new StackArray(5);

 //Adding elements
stack.push(1);
stack.push(2);
stack.push(3);
stack.push(4);

System.out.println("Top element of stack: " + stack.display());

System.out.println("Popped element from stack: " + stack.pop());

System.out.println("Top element of stack after pop: " + stack.display());
//Deleting elements
stack.pop();

System.out.println("Top element of stack after pop: " + stack.display());

}  
}
