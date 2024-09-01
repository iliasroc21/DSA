package leetcode.array;

public class MinSizeSubArraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int total = 0 ;
        for(int right = 0 , left = 0 ; right< nums.length ; right++){
            total = total  +nums[right];
            while(total>=target){
                minLength = Math.min(minLength , right-left+1);
                total = total -nums[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
