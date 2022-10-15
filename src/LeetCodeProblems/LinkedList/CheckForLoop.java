package LeetCodeProblems.LinkedList;

//Question: 141
public class CheckForLoop {

    class Node{
        Node next;
        int value;

        public Node(int value) {
           this.value=value;
        }
    }
    static Node head=null;
    static Node tail=null;

    public void insertNode(int value){
        //Create a node with the value to e inserted
        Node newNode=new Node(value);

        //check if the list is empty
        if(head==null && tail == null) {
            head = newNode;
            tail = newNode;
        }

        //if not empty
        tail.next=newNode;
        newNode.next=null;
        tail=newNode;

    }

    public void createALoop(int pos){
        //if invalid position provided dont create a loop
        if(pos == -1)
            return;


        Node current=head;
        int count=0;
        //Reach till the position where you want to point from tail to create a loop
        while(current!=null && pos!=count){
            current=current.next;
            count++;
        }
        tail.next=current;
    }

    public void printList(){
        Node current =head;
        while(current!=null){
            System.out.println(current.value);
            current=current.next;
        }
    }

    public boolean hasLoop(){
        //two pointers to check is list has loop
        Node slowPointer = head;
        Node fastPointer = head.next;

        //If these two pointers meet at any position in list then the list contains a loop.
        //Slow pointer gets incremented by 1 Node and fast pointer by 2 nodes of list.
        while(fastPointer !=null && fastPointer.next != null){
            if(fastPointer == slowPointer)
                return true;

            slowPointer=slowPointer.next;
            fastPointer=fastPointer.next.next;
        }


        return false;
    }



    public static void main(String[] args) {
        CheckForLoop ck = new CheckForLoop();

        ck.insertNode(20);
        ck.insertNode(21);
        ck.insertNode(15);
        ck.insertNode(25);
        ck.createALoop(2);
//        ck.printList();

        System.out.println("Above List hasLoop: "+ck.hasLoop());


    }


}
