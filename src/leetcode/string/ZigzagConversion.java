package leetcode.string;

public class ZigzagConversion {
    public String convert(String s, int numRows){
        char[] chars = s.toCharArray();
        int n =s.length() ;
        StringBuilder[] strs = new StringBuilder[numRows];
        for(int i = 0 ; i < numRows ; i++){
            strs[i]= new StringBuilder();
        }
        int i = 0 ;
        while(i < n){
            //going to the bottom vertically
            for(int j = 0 ; j < numRows && i < n ; j++  ){
                strs[j].append(chars[i++]);
            }
            //going to the top obliquely
            for(int j = numRows-2 ; j >=1 && i < n;j--){
                strs[j].append(chars[i++]);
            }

        }
        for(int j = 1 ;j < strs.length ; j++){
            strs[0].append(strs[j]);
        }
        return strs[0].toString() ;
    }
}
