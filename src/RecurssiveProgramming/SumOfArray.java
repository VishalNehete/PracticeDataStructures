package RecurssiveProgramming;

public class SumOfArray {
    static int[] arr ={2,5,1,7,8};
    public static void main(String[] args) {


        System.out.println("Sum of array is: "+sumOfArray(arr.length-1));
    }

    private static int sumOfArray(int length) {
        if (length==0)
            return arr[length];
        return arr[length]+sumOfArray(length-1);

    }
}
