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
