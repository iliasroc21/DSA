package leetcode.hash_tables;

import java.util.HashSet;
import java.util.Set;

public class LonguestConsecutiveSequence {
    public static int longestConsecutiveSequence(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for(int num :nums){
            mySet.add(num);
        }
        int longuest = 0 ;
        for(int num : nums){
            if(!mySet.contains(num-1)){
                int currentNum = num ;
                int currentStreak =  1 ;
                while(mySet.contains(currentNum+1)){
                    currentNum++;
                    currentStreak++;

                }
                longuest = Math.max(longuest , currentStreak);
            }
        }
        return longuest;


    }
}
