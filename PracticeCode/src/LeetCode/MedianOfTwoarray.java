package LeetCode;

import java.util.*;

public class MedianOfTwoarray {
	
	private static double findMedianSortedArrays(int nums1[],int nums2[]) {
	    // arrange elements serially
		
        List<Double> l=new ArrayList<>();
        for(double i:nums1) {
        	l.add(i);
        }
        for(double i:nums2) {
        	l.add(i);
        }
        Collections.sort(l);
        for(double i:l) {
        	System.out.println(i);
        }
        //Find middle element

        if(l.size()%2 == 0) {
        	return (l.get((l.size()%2)+1) + l.get(l.size()%2+2))/2;
        }else {
        	return l.get(l.size()%2);
        }
		
		
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		int nums1[]= {2,1};
		int nums2[]= {3,4};
		System.out.println("Median of two array is: "+findMedianSortedArrays(nums1, nums2));
	}

}

