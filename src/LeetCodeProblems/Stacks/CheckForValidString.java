package LeetCodeProblems.Stacks;

import java.util.Stack;

public class CheckForValidString {
    public static void main(String[] args) {
        String str = "{[()]}";
        char[] charstr = str.toCharArray();
        Stack<Character> st = new Stack<>();
        for (char c : charstr) {
            if (c == '{' || c == '(' || c == '[') {
                st.push(c);
            } else if (st.peek() == '{' && c == '}') {
                st.pop();
            }else if (st.peek() == '(' && c == ')') {
                st.pop();
            } else if (st.peek() == '[' && c == ']') {
                st.pop();
            }
        }
        if(st.isEmpty())
            System.out.println("Valid String");
        else
            System.out.println("Invalid String");
    }
}
