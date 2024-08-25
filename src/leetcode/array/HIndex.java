package leetcode.array;

import java.util.Arrays;

public class HIndex {
    public int hIndex(int[] citations) {
        int result = citations.length;
        int index = 0 ;
        Arrays.sort(citations);
        while(index < citations.length){
            if(citations[index] < result){
                index++;
                result--;
            }
            else return result;
        }
        return result ;
    }
}
