package sets;

import java.util.*;

/*
 * Given an array, find if there exists a sub array with sum equals to zero.
 * n < 10^5 where n is the size of array.
 */

public class SubarrayWithZeroSum {

	public static void main(String[] args) {
		
	int[] a = {2, 1, 3, -4, -2};
	int k = -3;
	boolean found = false;
	
//	Brute force method
	
//	for (int i = 0; i < a.length; i++) {
//		int sum = 0;
//		for(int j = i; j<a.length; j++) {
//			sum += a[j];
//			if(sum == 0) {
//				found = true;
//				break;
//			}
//		}
		  
//		if(found) 
//			break;
//	}
	
//	Optimized method
	
	Set<Integer> set = new HashSet<>();
	
	int sum = 0;
	
	for(int element: a) {
		set.add(sum);
		sum += element;
		if(set.contains(sum-k)) {
			found = true;
			break;
		}
	}
	
	System.out.println("found " + found);	
		
	}

}
