package LeetCodeProblems.HashMaps;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckForDistinctNumbers {
    public static void main(String[] args) {
        int[] num={2,3,4,2,10};
        Set<Integer> setNumbers=new HashSet<>();
        for(int n:num){
            setNumbers.add(n);
        }
        
        if(num.length<1){
            System.out.println("False");
        } else if (num.length==setNumbers.size()) {
            System.out.println("False");
        }else{
            System.out.println("True");
        }
    }
}
