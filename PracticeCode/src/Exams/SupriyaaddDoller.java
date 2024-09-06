package Exams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SupriyaaddDoller {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf=new BufferedReader(new  InputStreamReader(System.in));
		int N=Integer.parseInt(bf.readLine().trim());
		String S=bf.readLine().trim();
		String modifiedStrig=addDollarAfterVowels(S);
		System.out.println(modifiedStrig);
	}

	public static String addDollarAfterVowels(String s) {
	    StringBuilder sb = new StringBuilder(s);
	    int n = sb.length();
	    for (int i = 0; i < n - 1; i++) {
	        char c1 = sb.charAt(i);
	        char c2 = sb.charAt(i + 1);
	        if (isVowel(c1) && isVowel(c2)) {
	            sb.insert(i + 2, '$');
	            n++; // need to increment length to avoid index out of bounds
	            i++; // need to skip the next character
	        }
	    }
	    return sb.toString();
	}

	private static boolean isVowel(char c) {
	    return "aeiou".indexOf(c) != -1;
	}

}
