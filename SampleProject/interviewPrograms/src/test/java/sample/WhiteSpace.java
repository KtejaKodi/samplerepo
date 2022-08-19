package sample;

public class WhiteSpace {
	public static void main(String[] args) {
		String value="Num value space";
				int count=value.length();
				StringBuffer sb=new StringBuffer();
				for(int i=0;i<count;i++) {
					if(!Character.isWhitespace(value.charAt(i))) {
						System.out.print(value.charAt(i));
						sb.append(value.charAt(i));
					}
					
				}
				System.out.println();
				System.out.println(sb);
	}

}
