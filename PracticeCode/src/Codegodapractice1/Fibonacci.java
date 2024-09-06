package Codegodapractice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter N of Series: ");
		int n=Integer.parseInt(bf.readLine().trim());
		int a=1;
		int b=1;
		int c=a+b;
		System.out.print(a+" "+b+" "+c);
		for(int i=3; i<=n;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(" "+c+" ");
			
			
		}
	}

}
