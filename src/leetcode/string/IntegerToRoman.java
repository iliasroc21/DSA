package leetcode.string;

import java.util.ArrayList;

public class IntegerToRoman {
    public String intToRoman(int num){
        final  int[] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        final  String[] rom = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder result = new StringBuilder();
        for(int i =0 ; num > 0 ;i++){
            while(num>=val[i]){
                result.append(rom[i]);
                num-=val[i];
            }
        }
        return result.toString();
    }
}
