package LeetCodeProblems.NumberSystem;

public class PowerOfTwo {

    public static void main(String[] args) {
        int num=8;
        System.out.println(num+" is power of 2: "+checkforPowerOfTwo(num));
    }

    private static boolean checkforPowerOfTwo(int num) {
        if(num==0)
            return false;


        while(num%2==0){
            num=num/2;
        }
        return num==1;



    }
}
