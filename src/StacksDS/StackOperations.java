package StacksDS;

import java.util.Stack;

public class StackOperations {



    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();

        //Inserting an deleting elements on stack
        st.push(10);
        st.push(12);
        st.push(8);
        st.push(5);                        //10,12,8,5
        st.pop();                               //10,12,8
        System.out.println("Stack => "+st);

        //Getting the first element of stack
        System.out.println(st.peek());           //10,12,8

        //insert at index using direct function
        st.insertElementAt(20,2);      //10,12,20,8
        st.remove(3);                      //10,12,8
        System.out.println("After insert operation:"+st);

        //Reverse the Stack
        reverseTheStack(st);
        System.out.println("Reversed Stack => "+st);

        //insert at index using customized function
        insertValueAt(2,43,st);
        insertValueAt(1,26,st);
        System.out.println("After customized insert operation:"+st);

        //find the minimum nmber from stack
        int minVal=findMinimumValue(st);
        System.out.println("Minimum Value from Stack is => "+minVal);






    }

    private static int findMinimumValue(Stack<Integer> st) {
        int minVal=0;
        Stack<Integer> temp = new Stack<Integer>();

        while(!st.empty()){
            minVal=st.peek();

            temp.push(minVal);
            st.pop();
            if(st.peek()<temp.peek()){
                minVal=st.peek();
                temp.push(minVal);
            }else {
                st.pop();
            }

        }




        return minVal;
    }

    private static void insertValueAt(int index, int val, Stack<Integer> st) {
        Stack<Integer> temp =new Stack<Integer>();
        int count=0;

        while(count!=index-1) {
            int peek = st.peek();
            temp.push(peek);
            st.pop();
            count++;
        }
        st.push(val);

        while(!temp.empty()){
            int tmp=temp.peek();
            st.push(tmp);
            temp.pop();
        }


    }

    private static void reverseTheStack(Stack<Integer> st) {
        Stack<Integer> st1 =new Stack<Integer>();
        Stack<Integer> st2 =new Stack<Integer>();

        moveStack(st,st1);
        moveStack(st1,st2);
        moveStack(st2,st);



    }

    private static void moveStack(Stack<Integer> source, Stack<Integer> dest) {

        while (!source.empty()) {
            int val = source.peek();
            dest.push(val);
            source.pop();
        }


    }


}
