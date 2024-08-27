package leetcode.array;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sGum = 0 , sCost = 0  , res= 0 ;
        int total = 0;
        for(int i = 0 ; i < gas.length ; i++){
            sGum+=gas[i];
            sCost+=cost[i];
        }
        if(sCost > sGum)return -1;
        for(int i = 0 ; i < gas.length ;i++){
            total +=gas[i]-cost[i];
            if(total <0 ){
                total  = 0 ;
                res = i+1 ;
            }
        }
        return res;
    }

}
