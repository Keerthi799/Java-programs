package Keerthi;

import java.util.Stack;

public class DemoStack {

    public static void main(String[] args) {
        // Create a new Stack of Integers
        Stack<Integer> stack = new Stack<Integer>();
        
        // Push the element 10 onto the stack
        stack.push(10);
        
        // Add the element 20 onto the stack (add() is equivalent to push())
        stack.add(20);
        
        // Push the element 30 onto the stack
        stack.push(30);
        
        // Push the element 50 onto the stack
        stack.push(50);
        
        // Print the entire stack
        System.out.println(stack);
        
        // Print the top element of the stack (without removing it)
        System.out.println(stack.peek());
        
        // Remove and return the top element of the stack
        System.out.println(stack.pop());
        
        // Print the new top element of the stack (after the previous pop operation)
        System.out.println(stack.peek());
        
        // Search for the element 10 in the stack and return its position (1-based index)
        System.out.println(stack.search(10));
        
        // Print the entire stack again
        System.out.println(stack);
    }
}