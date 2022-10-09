package RecurssiveProgramming;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int num=5;

        System.out.println("Factorial of "+num+"is: "+fact(5));
    }

    private static int fact(int i) {

        if(i==1){
            return 1;
        }
        else {
            return i*fact(i-1);
        }
    }
}
