package leetcode.array;

public class JumpGameII {
    public int jump(int[] nums) {
        int jumps = 0 ;
        int right =  0 ;
        int farthest = 0 ;
        for(int i =0 ; i < nums.length-1; i++){
            farthest = Math.max(farthest , i + nums[i]);
            if(i == right){
                right = farthest;
                jumps++;
            }
        }
        return jumps ;
    }
}