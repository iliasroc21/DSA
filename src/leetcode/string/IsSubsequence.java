package leetcode.string;

public class IsSubsequence {
    public boolean isSubSequence(String s , String t){
        int n = s.length();
        int m = t.length();
        int index = 0 ;
        for(int i = 0 ; i < m ; i++ ){
            if(index == n)return true;
            if(s.charAt(index) == t.charAt(i)){
                index++;
            }
        }
        return index == n ;
    }
}
