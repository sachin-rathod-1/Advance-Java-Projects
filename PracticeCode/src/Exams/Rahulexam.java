package Exams;

import java.util.*;

public class Rahulexam {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter Amount of money: ");
        int X = sc.nextInt(); // Total amount of money to be collected
        System.out.print("Enter Number of Houses: ");
        int Y = sc.nextInt(); // Number of houses
        
        int ways = collectMoney(X, Y);
        
        System.out.println("Number of ways to collect money: " + ways);
    }
    
    public static int collectMoney(int X, int Y) {
        if (Y == 1) {
            return 1;
        }
        
        if (X == 0) {
            return 1;
        }
        
        int ways = 0;
        
        while(X<=0) {
        	
        	
            ways += collectMoney(X-1, Y );
        }
        
        return ways;
    }
}
