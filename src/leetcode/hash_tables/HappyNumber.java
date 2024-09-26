package leetcode.hash_tables;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set  = new HashSet<>();
        set.add(n);
        return isHappyHelper(n , set);
    }
    private boolean isHappyHelper(int n , Set<Integer> set){
        if(n==1)return true;
        int sum = sqrtSum(n);
        if(set.contains(sum))return false;
        set.add(sum);
        return isHappyHelper(sum ,set);
    }
    private  int sqrtSum(int n ){
        int result =0 ;
        while (n > 0) {
            result += (n % 10) * (n % 10);
            n /= 10;
        }
        return result ;
    }
}
