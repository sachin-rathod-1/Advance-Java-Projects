package Exams;

public class interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "Interview";
		String p= new String("Interview");
		
//		System.out.println(s.hashCode());
//		System.out.println(p.hashCode());
//		
//		System.out.println(s==p);
//		System.out.println(s.equals(p));
//		if( s == p ) {
//			System.out.println("true");
//		}else {
//			System.out.print("false");
//		}
		
		//System.out.println(s);
		
		B b=new B();
		b.add();
		b.multiply();
		
	}

}

 class A{
	 private int a=10;
	 private int b=20;
	 public void add() {
		 System.out.println("Addition is: "+(a+b));
	 }
	 public int geta() {
		 return a;
	 }
	 public int getb() {
		 return b;
	 }
 }
 
 class B extends A{
	 public void multiply() {
		 System.out.println("Multiplication is: "+(super.geta() * super.getb()));
	 }
 }
