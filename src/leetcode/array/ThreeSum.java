package leetcode.array;

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
            Set<List<Integer>> result  = new HashSet<>();

            if (nums == null || nums.length < 3)return new ArrayList<>(result);
            Arrays.sort(nums);
            int size = nums.length;
            for (int i = 0; i < size - 2; i++)
            {
                if(i==0 || (i > 0 && nums[i]!=nums[i-1])){
                    int left = i + 1;
                    int right = size - 1;

                    while (left < right){
                        int sum =  nums[i] + nums[left] + nums[right];
                        if (sum == 0){
                            result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                            while(left <right && nums[left]==nums[left+1])left++;
                            while(left <right && nums[right]==nums[right-1])right--;
                            left++;
                            right--;
                        }
                        else if (sum < 0)left++;
                        else right--;
                    }
                }

            }
            return new ArrayList<>(result);
        }

}
