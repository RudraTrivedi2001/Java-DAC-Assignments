package Assignment_1_All;

import java.util.Arrays;

public class KthLargest {

    
public static void main(String args[]) {

    int arr[] = {1, 2, 6, 4, 5, 3} ;
    int k=3;			//index of array					
    Arrays.sort(arr);   //sorted array -1,2,3,4,5,6;
    System.out.println("largest element "+arr[arr.length-k]);
    System.out.println("smallest element "+arr[k-1]);
}
}