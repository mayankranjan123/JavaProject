package recursion;

import java.util.Stack;

public class ReverseStack {
    static Stack<Integer> st = new Stack<>();
    public static void main(String[] args) {
        ReverseStack rv = new ReverseStack();
        rv.st.push(1);
        rv.st.push(2);
        rv.st.push(3);
        rv.st.push(4);
        System.out.println("Original Stack: " + rv.st);
        reverseStack();
        System.out.println("Reversed Stack: " + rv.st);
    }
    static void reverseStack() {
        if (st.isEmpty() == false) {
            int x = st.pop();
            reverseStack();
            insertAtBottom(x);
        }
    }

    private static void insertAtBottom(int x) {
        if (st.isEmpty())  {  //if (st.isEmpty() || x > st.peek()) - to sort stack using recursion
            st.push(x);
            return;
        } else {
            int y = st.pop();
            insertAtBottom(x);
            st.push(y);
        }
    }
}
