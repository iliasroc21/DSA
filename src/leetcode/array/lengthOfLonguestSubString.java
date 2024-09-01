package leetcode.array;

public class lengthOfLonguestSubString {
    public int lengthOfLongestSubstring(String s) {
        int max = 0 ;
        for(int right = 0 , left  = 0 ; right < s.length() ;right++){
            int indexOfFirst = s.indexOf(s.charAt(right) ,left);
            if(indexOfFirst!=right){
                left= indexOfFirst +1 ;
            }
            max = Math.max(max , right-left+1);
        }
        return max;

    }
}
