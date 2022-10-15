package LeetCodeProblems.NumberSystem;

public class PowerOfTwo {

    public static void main(String[] args) {
        int num=8;
        System.out.println(num+" is power of 2: "+checkforPowerOfTwo(num));
    }

    private static boolean checkforPowerOfTwo(int num) {
        if(num==0)
            return false;

        //If remainder of that number after dividing it by 2 is zero then
        // continue by furthur dividing it by 2 till you get the final result as 1.
        // if you get 1 at end hen the number if power of 2
        while(num%2==0){
            num=num/2;
        }
        return num==1;



    }
}
