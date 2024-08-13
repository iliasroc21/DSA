package algorithms.sorts.quicksort;

import java.util.Arrays;

public class QuickSort {

    public static void quickSortHelper(int[]array , int left , int right){
        if(left < right){
            int pivoxIndex = pivot(array , left , right);
            quickSortHelper(array , left , pivoxIndex-1);
            quickSortHelper(array ,pivoxIndex +1, right);
        }

    }
    public static void quickSort(int[]array ){
        quickSortHelper(array ,0 , array.length);
    }

    public static int pivot(int[] array , int pivotIndex , int endIndex){
        int swapIndex = pivotIndex;
        for(int i = pivotIndex+ 1 ; i< endIndex ;i++){
            if(array[i] < array[pivotIndex]){
                swapIndex++;
                swap(array , swapIndex , i);
            }
        }
        swap(array, pivotIndex , swapIndex);
        return swapIndex ;
    }

    public static void swap(int[] array ,  int firstIndex , int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp ;
    }

    public static void main(String[] args) {
        int[] myArray = {4,6,1,7,3,2,5};

        quickSort(myArray );

        System.out.println( Arrays.toString( myArray ) );

    }
}
