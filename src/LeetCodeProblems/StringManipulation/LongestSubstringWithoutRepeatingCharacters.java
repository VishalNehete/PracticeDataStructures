package LeetCodeProblems.StringManipulation;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str="abcabcda";
        Set<Character> charSet=new HashSet<>();
        int i=0,j=0,longestSubstring=0;
        while(i<str.length()){
            if(!charSet.contains(str.charAt(i))){
                charSet.add(str.charAt(i));
                longestSubstring=Math.max(longestSubstring,charSet.size());
                i++;
            }else{
                charSet.remove(str.charAt(j));
                j++;
            }
        }
        System.out.println(longestSubstring);
    }
}
