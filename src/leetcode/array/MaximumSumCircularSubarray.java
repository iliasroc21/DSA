package leetcode.array;



public class MaximumSumCircularSubarray {
    public int maxSubarraySumCircular(int[] nums) {
        int sum = 0 ;
        int currMax = 0 , max = Integer.MIN_VALUE;
        int currMin = 0 , min = Integer.MAX_VALUE;
        for(int a : nums){
            sum+=a;
            currMax = Math.max(currMax+a , a);
            currMin = Math.min(currMin +a , a);
            max= Math.max(currMax, max);
            min = Math.min(currMin, min);
        }
        return max < 0 ? max : Math.max(max , sum-min) ;
    }
}
