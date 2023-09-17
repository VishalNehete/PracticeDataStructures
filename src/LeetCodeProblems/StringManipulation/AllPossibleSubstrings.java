package LeetCodeProblems.StringManipulation;

public class AllPossibleSubstrings {
    public static void main(String[] args) {
        String str="abcabc";
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i, j));
                count++;
            }
        }
        System.out.println("Total count of substrings possible: "+count);

    }
}
