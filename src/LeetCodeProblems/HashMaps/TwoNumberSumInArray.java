package LeetCodeProblems.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class TwoNumberSumInArray {
    public static void main(String[] args) {
        int[] number={2,3,5,1,7};
        int target=5;
        Map<Integer,Integer> my_map=new HashMap<>();

        for(int i=0;i<number.length;i++){
            if(my_map.containsKey(target-number[i]))
                System.out.println(my_map.get(target-number[i])+" "+i);
            my_map.put(number[i],i);
        }
    }
}
