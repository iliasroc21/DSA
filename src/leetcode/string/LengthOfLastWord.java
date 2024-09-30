package leetcode.string;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        return strs[strs.length-1].length();
    }
}
