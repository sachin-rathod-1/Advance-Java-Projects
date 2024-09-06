package Exams;

import java.util.Scanner;

public class AshisharrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of Testcases: ");
		int test=sc.nextInt();
		for(int i=1; i<=test; i++) {
			System.out.println("********************************************");
			System.out.println(i+"th Test Case");
			System.out.print("Enter Size of an Array: ");
			int n=sc.nextInt();
			System.out.print("Enter Value of K: ");
			int k=sc.nextInt();
			
			requiredarry(n,k);
			System.out.println();
		}
		
	}

	private static void requiredarry(int n, int k) {
		// TODO Auto-generated method stub
		int ar[]=new int[n];
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<ar.length; i++) {
			System.out.print("Enter "+(i+1)+" th element: ");
			ar[i]=sc.nextInt();
		}
		int start= k%n==0?0:n-k%n;
		System.out.println("Required Output is: ");
		for(int i=0; i<n; i++) {
			System.out.print(ar[start]+" ");
			start = (start+1)%ar.length;
		}
		
	}

}
