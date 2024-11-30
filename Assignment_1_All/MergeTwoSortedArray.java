package Assignment_1_All;

import java.util.Arrays;

public class MergeTwoSortedArray {
	
	public static void main(String[] args) {
		
		int[] aa= {5,4,3,2,1};
		int[] bb= {12,9,6,8,15};
		
		
		int[] result=new int[aa.length+bb.length];
	
		System.arraycopy(aa, 0, result, 0, aa.length);
		System.arraycopy(bb, 0, result, aa.length,bb.length);
		
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));
		
	
	}
}
