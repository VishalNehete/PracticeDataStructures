package LeetCodeProblems.Queue;

/*
There are n people in a line queuing to buy tickets, where the 0th person is at the front of the line and the (n - 1)th person is at the back of the line.

You are given a 0-indexed integer array tickets of length n where the number of tickets that the ith person would like to buy is tickets[i].

Each person takes exactly 1 second to buy a ticket. A person can only buy 1 ticket at a time and has to go back to the end of the line (which happens instantaneously) in order to buy more tickets. If a person does not have any tickets left to buy, the person will leave the line.

Return the time taken for the person at position k (0-indexed) to finish buying tickets.
 */

//Question: 2073



public class TimeToGetTickets {


    public static void main(String[] args) {
        int tickets[]={2,3,2};
        int pos=2;

        System.out.println("Time required to buy tickets for person at position "+pos+" is: "+caculateTime(tickets,pos));
    }

    private static int caculateTime(int[] tickets, int pos) {

        int seconds=0;

        //Iterate until the required person has purchased all the tickets
        while(tickets[pos] > 0){

            //Iterate for every element in array
            for(int i=0;i<tickets.length;i++){
                if(tickets[i]>0){
                    //1 ticket purchased---- balance ticket count decreased by 1
                    tickets[i]--;
                    //1 second consumed for 1 ticket
                    seconds++;
                }

                //break if required person has purchased all the tickets
                if(tickets[pos]==0)
                    break;

            }

        }

        return seconds;

    }
}
