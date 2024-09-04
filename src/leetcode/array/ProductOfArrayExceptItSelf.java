package leetcode.array;

public class ProductOfArrayExceptItSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int total = 1 ;
        for(int i = 0 ; i <nums.length ; i++){
            result[i] = total ;
            total  = total * nums[i];
        }
        total = 1 ;
        for(int i = nums.length-1 ; i > -1 ; i--){
            result[i] = result[i]*total ;
            total = total*nums[i];
        }
        return result;

    }
}
