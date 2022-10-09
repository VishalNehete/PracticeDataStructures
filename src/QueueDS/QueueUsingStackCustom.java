package QueueDS;

import java.util.Stack;

public class QueueUsingStackCustom {

    static int rear;
    static int front;
    static int size;
    static int[] a;

    static Stack<Integer> stack=new Stack<>();

    public static void enQueue(int value){
        stack.push(value);
    }

    public static int deQueue(){
        Stack<Integer> temp = new Stack<>();
        while(!stack.isEmpty()){
            temp.push(stack.pop());
        }
        int ele= temp.pop();
        while (!temp.isEmpty()){
            stack.push(temp.pop());
        }
        return ele;
    }


    public static void main(String[] args) {
        enQueue(3);
        enQueue(7);
        enQueue(10);
        deQueue();
        enQueue(4);
        enQueue(8);
        deQueue();


        System.out.println(stack);
    }



}
