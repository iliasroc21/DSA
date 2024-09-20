package leetcode.array;

public class TrapingRainWater {
    public int trap(int[]height){
        int water = 0 ;
        int left = 0 , right= height.length -1 ;
        int leftMax = height[0] , rightMax= height[height.length-1];
        while(left< right){
            if(leftMax <rightMax){
                left++;
                if(leftMax < height[left]){
                    leftMax = height[left];
                }else water+= leftMax-height[left];
            }
            else{
                right--;
                if(rightMax < height[right]){
                    rightMax = height[right];
                }
                else water +=rightMax-height[right];
            }
        }
        return water;
    }
}
