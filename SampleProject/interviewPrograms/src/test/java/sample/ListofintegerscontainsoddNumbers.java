package sample;


import java.util.Arrays;
import java.util.List;

public class ListofintegerscontainsoddNumbers {
	
	public static void main(String[] arg) {
		//int[] arrayValues= {1,3,5,7,4,8};
		
		List<Integer> list=Arrays.asList(1,2,4,8,5,35);
		for(int i:list) {
			if(i%2==0){
				System.out.println(i + "Even Number");
			}
			else System.out.println(i + "Odd Number");
			
		}
		
		
	}

}
