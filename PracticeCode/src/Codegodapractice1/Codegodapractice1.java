package Codegodapractice1;


public class Codegodapractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=1;
		for(int i=1;i<=128;i+=i){
		    x+=x;       
		   }
		System.out.print("The Answer is: "+x);
	}
}
