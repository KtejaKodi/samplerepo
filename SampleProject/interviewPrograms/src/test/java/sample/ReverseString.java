package sample;

public class ReverseString {
	public static void main(String[] args) {
		
		String value="PremBhushan";
		int count=value.length();
		for(int i=count-1;i>=0;i--) {
			System.out.print(value.charAt(i));
			
		}
		System.out.println();
		reversekeyWord();
		reversewithAppened();
	}
	
	
	public static void reversekeyWord() {
		String value="tejaKrishna";
		StringBuffer sb=new StringBuffer(value);
		sb.reverse();
		System.out.println(sb.toString());
	}
	
	public static void reversewithAppened() {
		String value="Kodi";
		char[] charValues=value.toCharArray();
		int count=charValues.length;
		StringBuffer sb=new StringBuffer();
		for(int i=count-1; i>=0;i--) {
			sb.append(charValues[i]);
			
		}
		System.out.println(sb.toString());
	}
	
}


