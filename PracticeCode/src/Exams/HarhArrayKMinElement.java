package Exams;

import java.util.Scanner;

public class HarhArrayKMinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int N=5;
		int k=6;
		int arr[]= {1,3,4,7,9};
		System.out.println(findKthMissingNumber(arr, k));
	}

	
	
	
	
	public static int findKthMissingNumber(int[] arr, int k) {
	    int max = 0;
	    for (int i = 0; i < arr.length; i++) {
	        max = Math.max(max, arr[i]);
	    }

	    boolean[] visited = new boolean[max + k + 1];

	    for (int i = 0; i < arr.length; i++) {
	        visited[arr[i]] = true;
	    }

	    int count = 0;
	    for (int i = 1; i <= max + k; i++) {
	        if (!visited[i]) {
	            count++;
	            if (count == k) {
	                return i;
	            }
	        }
	    }

	    // If we reach here, it means that the kth missing number is not present in the array
	    return arr[arr.length - 1] + k - count;
	}


}


