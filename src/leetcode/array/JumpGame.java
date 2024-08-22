package leetcode.array;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int jump = 0 , index= 0 ;
        while(index<nums.length && index <=jump ){
            jump = Math.max(jump , index+ nums[index]);
            if(jump >=nums.length-1)return true;
            index++ ;
        }
        return false       ;
    }
}
