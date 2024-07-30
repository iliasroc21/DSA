package leetcode.hash_tables;

import java.util.HashMap;

public class ItemInCommon {
    public static  boolean itemInCommon(int[] array1 , int[] array2){
        HashMap<Integer , Boolean> myHashMap = new HashMap();
        for(int i = 0 ; i < array1.length ; i++){
            myHashMap.put(array1[i] , true);
        }
        for(int i =0 ; i < array2.length ;i++){
            if(myHashMap.get(array2[i]) !=null)return true;
        }
        return false;
    }
}
