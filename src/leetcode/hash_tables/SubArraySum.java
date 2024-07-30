package leetcode.hash_tables;

import java.util.HashMap;

public class SubArraySum {
    public static int[] subarraySum(int[] nums , int target){
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0 , -1);
        int currentSum = 0 ;
        for(int i = 0 ; i < nums.length ;i++){
            currentSum +=nums[i];
            if(map.containsKey(currentSum -target)){
                return new int[]{map.get(currentSum-target)+1 , i};

            }
            map.put(currentSum , i );
        }
        return new int[]{};
    }
}
