package StacksDS;

import java.util.Stack;

public class CheckIfStringIsBalanced {
    public static void main(String[] args) {

        String str="(2+)[{4}]";
        boolean isBalanced=checkIsBalanced(str);
        System.out.println(isBalanced);






    }

    private static boolean checkIsBalanced(String str) {
        Stack<Character> stack=new Stack();

        for(char ch:str.toCharArray()){
            if(ch=='(' || ch=='[' || ch == '{'){
                stack.push(ch);
            } else if (ch==')' || ch==']' || ch == '}') {
                Character top=stack.pop();
                if(top == '(' && ch!=')'|| top == '[' && ch!=']'|| top == '{' && ch != '}'){
                    return false;
                }
            }
        }
        return true;



    }
}
