package Exams;



import java.util.Scanner;

public class CandyDistribution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] boxes = new int[n];
        for (int i = 0; i < n; i++) {
            boxes[i] = input.nextInt();
        }
        int minSteps = minStepsToEmptyBox1(boxes);
        System.out.println(minSteps);
    }

	private static int minStepsToEmptyBox1(int[] boxes) {
		// TODO Auto-generated method stub
		int count=0;
		int i=0;
		return 0;
	}

}