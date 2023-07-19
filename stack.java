//The stack is a linear data structure that is used to store the collection of objects. It is based on Last-In-First-Out (LIFO).
// the two most important operations that are push and pop.
// top is the top of the stack 
// top = -1 the stack is empty, top = n-1 the stack is full, top = 0 ths stack has only one element, top = n stack is overflow
// It has some methods 1 .empty(), 2 .push(), 3 .pop(), 4 .size(), 5 .search()

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        boolean result = s.empty();
        System.out.println("Is Stack empty ? " + result);

        // Push elements
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println("Elements in the stack : " + s);

        // POP elements only once
        // System.out.println(s.pop());

        // search element
        int loc = s.search(40);
        System.out.println("Location of the element :" + loc);

        System.out.println("Size of the stack: " + s.size());
    }
}
