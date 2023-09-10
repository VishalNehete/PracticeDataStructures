package LeetCodeProblems.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class CountOccurencesOfCharacters {
    public static void main(String[] args) {
        String str="GHTUGHFFB";
        char[] charStr=str.toCharArray();
        Map<Character,Integer> my_map=new HashMap<>();

        for(Character c:charStr){
            if(my_map.containsKey(c))
                my_map.put(c,my_map.get(c)+1);
            else
                my_map.put(c,1);
        }
        System.out.println(my_map);


    }
}
