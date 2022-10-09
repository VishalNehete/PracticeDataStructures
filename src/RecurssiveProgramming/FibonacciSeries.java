package RecurssiveProgramming;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num=4;
        System.out.println("Element at "+num+" in fibonacci series is: "+findFibo(num));
    }

    private static int findFibo(int num) {
        if(num==0 || num ==1){
            return num;
        }
        else {
            return findFibo(num-1)+findFibo(num-2);
        }
    }
}
