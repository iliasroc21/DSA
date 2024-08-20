package leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0)+1);

        }
        for(Map.Entry<Integer , Integer> element : map.entrySet()){
            if(element.getValue() > nums.length /2){
                return element.getKey();
            }
        }
        return 0 ;
//        Arrays.sort(nums);
//        return nums[nums.length / 2];
    }
}
