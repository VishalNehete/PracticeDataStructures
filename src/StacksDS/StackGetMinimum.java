package StacksDS;

import java.util.Stack;

public class StackGetMinimum {

    static Stack<Integer> st=new Stack<Integer>();
    static Stack<Integer> temp=new Stack<Integer>();

    public static void main(String[] args) {
        customPush(8);
        customPush(6);
        customPop();
        int minVal=getMinimum();
        System.out.println("Minimum value on Stack is => "+minVal);
        customPush(14);
        customPush(2);
//        customPop();
        minVal=getMinimum();
        System.out.println("Minimum value on Stack is => "+minVal);

    }

    private static int getMinimum() {
        return temp.peek();
    }

    private static void customPop() {
        int item=st.peek();
        if(temp.peek()==item){
            temp.pop();
        }
    }

    private static void customPush(int val) {
        st.push(val);
        if(temp.isEmpty()){
            temp.push(val);
        }
        else if(temp.peek() > val){
            temp.push(val);
        }
    }
}
