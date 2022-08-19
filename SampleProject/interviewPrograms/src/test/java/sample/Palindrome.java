package sample;

public class Palindrome {
	public static void main(String[] args) {
		String value="Madam";
		String sum="";
		int count=value.length();
		for(int i=count-1;i>=0;i--) {
		sum=sum+ value.charAt(i);
			
		}
		System.out.println(sum);
		
		method1();
	}
	
	public static void method1() {
		int num=121;
		String sum="";
		String value=Integer.toString(num);
		int count=value.length();
		for(int i=count-1;i>=0;i--) {
			sum=sum+value.charAt(i);
			
		}
		int num2=Integer.parseInt(sum);
		System.out.println(num2);
		
	}

}
