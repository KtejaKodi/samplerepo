package sample;

public class Swap_Two_integers {
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
	     a=a+b;//a=30
	     b=a-b;//b=10
	     a=a-b;//a=20
	     
	     System.out.println(a);
	     System.out.println(b);
		
	     swap_int_thirdint();	
	}
	
	public static void swap_int_thirdint() {
		int a=10;
		int b=20;
		int c;
		c=a;
		a=b;
		b=c;
		
		 System.out.println(a);
	     System.out.println(b);
	}

}
