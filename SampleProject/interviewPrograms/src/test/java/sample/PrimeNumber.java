package sample;

public class PrimeNumber {
	public static void main(String [] args) {
		int flag=0;
		int n =6;
		 for (int i=2;i<=n/2;i++) {
		if(n%i ==0) {
			System.out.print(" not Prime");
			flag=1;
		break;	
		}
		}
		 if(flag==0) {
		
			 System.out.print("  Prime");}
		
	}

}
