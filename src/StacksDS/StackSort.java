package StacksDS;

import java.util.Stack;

public class StackSort {


    public static void main(String[] args) {
        Stack<Integer> main = new Stack<>();


        main.push(10);
        main.push(4);
        main.push(12);
        main.push(15);
        main.push(2);
        System.out.println(main);
        System.out.println("********************************");
        sortStack(main);



    }

    private static void sortStack(Stack<Integer> main) {
        Stack<Integer> temp = new Stack<>();

        while(!main.isEmpty()){
            int ele = main.pop();
            while(!temp.isEmpty() && temp.peek()>ele){
                main.push(temp.pop());
            }
            temp.push(ele);
        }
        System.out.println(temp);

    }


}
