package QueueDS;



public class QueueUsingArrayCustom {
    static int rear;
    static int front;
    static int size;
    static int[] a;

    public QueueUsingArrayCustom(int size){
        rear=-1;
        this.size=size;
        this.a=new int[size];
    }

    public static void enQueue(int value){
        rear++;                     //incrementing the rear pointer to make space for new element in queue
        a[rear]=value;              //assign the value at a[rear]

    }

    public static void sortedenQueue(int value){
        if(rear==-1){
            rear++;
            a[rear]=value;
        }

        else {
            for(int i=rear;i>=0;i--){
                if(a[i] > value){
                    a[i+1]=a[i];
                    if(i==0){
                        a[i]=value;
                    }
                }
                else {
                    a[i+1]=value;
                    break;
                }
            }
            rear++;

        }
    }

    public static int deQueue(){
        if(rear == -1){
            return -1;
        }
        else {
            int ele=a[0];
            for(int i=0;i<rear;i++){
                a[i]=a[i+1];
            }
            rear--;
            return ele;
        }
    }

    public static void printQueue(){
        for(int i=0;i<=rear;i++){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        QueueUsingArrayCustom qu = new QueueUsingArrayCustom(10);
        enQueue(5);
        enQueue(3);
        sortedenQueue(1);
        enQueue(7);
        deQueue();
        enQueue(10);
        enQueue(4);
        deQueue();
        printQueue();
    }






}
