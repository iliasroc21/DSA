package leetcode.heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class IPO {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital){
        int n = profits.length ;
        int[][] projects = new int[n][2];
        for(int i = 0 ; i < n  ;i++){
            projects[i][0] = capital[i];
            projects[i][1] = profits[i];
        }
        Arrays.sort(projects , (a,b)-> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());//storing the profits of the available projects that we can start with the current capital
        int i = 0 ;//used to keep track of the next project
        while(k-->0){
            while( i < n && projects[i][0]<= w){
                heap.add(projects[i][1]);
                i++;
            }
            if(heap.isEmpty()){
                break ;
            }
            w+=heap.poll();
        }
        return w ;
    }
}
