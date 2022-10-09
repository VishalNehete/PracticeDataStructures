package LinkedListsDS;

public class LinkedListOperations {

    class Node{
        int val;
        Node next;

        public Node(int val){
            this.val=val;
        }
    }

    static Node head;
    static Node tail;

    public void addAtEnd(int val) {
        Node newNode = new Node(val);
        if(head==null && tail == null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            newNode.next=null;
            tail=newNode;
        }

    }

    public void addAtBeginning(int val){
        Node newNode=new Node(val);
        newNode.next=head;
        head=newNode;
    }

    public void addAtIndex(int index,int val){
        Node newNode=new Node(val);
        int count = 0;
        Node current=head;
        Node temp;
        while(current!=null && count!=index-1){
            current=current.next;
            count++;
        }
        temp=current.next;
        current.next=newNode;
        newNode.next=temp;


    }

    public static void deleteNodeAtEnd(){
        Node current=head;
        while(current.next.next!=null){
            current=current.next;
        }
        current.next=null;
        tail=current;
    }

    public static void deleteNodeAtBeginning(){
        head=head.next;
    }

    public void deleteNodeAtIndex(int index){
        Node current=head;
        int count=0;
        while(current!=null && count!=index-1){
            current=current.next;
            count++;
        }
        current.next=current.next.next;

    }

    public void reverseLinkedList(){
        //Take three pointers
        Node current=head;
        Node prev=null;
        Node next=null;

        while(current!=null){
            //storing the value of next node in a variable
            next=current.next;

            //reversing the direction of linked list
            current.next=prev;

            //moving the prev pointer one node ahead
            prev=current;

            //moving the next pointer one node ahead
            current=next;

        }
        //at this point head is still pointing to beginning of original linked list
        //and current has become null to come out of while loop
        //prev pointer is holding the last value of original linked list(first value of new linked list), hence we can we use this to traverse instead of head
        printLinkedList(prev);



    }




    public static void printLinkedList(Node head) {
        Node current;
        current=head;
        System.out.println("This is your LinkedList -->");
        while(current!=null){
            System.out.println(current.val);
            current=current.next;
        }
    }

    public static void deleteNodeByValue(int val){
        Node current=head;
        Node prev=null;
        //when we have to remove the head node
        if(head.val==val){
            deleteNodeAtBeginning();
        }
        else if(tail.val==val){
            deleteNodeAtEnd();
        }
        else{
            current=head;
            prev=null;
            while(current!=null && current.val!=val){
                prev=current;
                current=current.next;
            }
            //we have hold of previous Node from the Node to be deleted in prev pointer
            //current pointer is pointing to the value that we want to delete
            prev.next=current.next;



        }

    }

    public static void deleteEvenNodes() {
        Node current=head;
        while(current!=null){
            if(current.val%2 == 0){
                deleteNodeByValue(current.val);
            }
            current=current.next;
        }
        printLinkedList(head);
    }

    public static void deleteOddNodes() {
        Node current=head;
        while(current!=null){
            if(current.val%2 != 0){
                deleteNodeByValue(current.val);
            }
            current=current.next;
        }
        printLinkedList(head);
    }






    public static void main(String[] args) {
        LinkedListOperations l=new LinkedListOperations();
        l.addAtEnd(10);
        l.addAtEnd(20);
        l.addAtEnd(24);
        l.addAtBeginning(1);
        l.addAtBeginning(16);                    //16,1,10,20,24
        l.addAtIndex(2,54);                //16,1,54,10,20,24
        l.deleteNodeAtEnd();                         //16,1,54,10,20
        l.deleteNodeAtBeginning();                   //1,54,10,20
        l.deleteNodeAtIndex(2);                      //1,54,20

        l.printLinkedList(head);
//        System.out.println("Printing Reversed LinkedList-->");
//        l.reverseLinkedList();                       //20,54,1

        l.addAtBeginning(32);
        l.addAtBeginning(25);                   //25,32,1,54,20

        l.printLinkedList(head);

        deleteEvenNodes();
        deleteOddNodes();

    }





}


