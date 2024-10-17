package leetcode.string;

public class FirstOccuranceInString {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length())return-1 ;
        for(int left = 0 ; left<= haystack.length()-needle.length();left++){
            int right = 0 ;
            while(right<needle.length() && needle.charAt(right)==haystack.charAt(left+right))right++;
            if(right==needle.length())return left;
        }
        return -1 ;
    }
}
