package Dailypractice;

import java.util.Arrays;

public class practice03112024 {
      
	public static void main(String[] args) {
		
		int [] number= {10,15,7,13,16,81,19,20,30};
		
		int highest=0;
		
		int second_highest=0;
		
		Arrays.sort(number);
		
		for(int i=0;i<number.length-1;i++) {
			
	//	System.out.println(number[i]);
			
	//	System.out.println(Arrays.toString(number));
			
			if(number[i]>highest) {
				second_highest=highest;
				highest=number[i];
			}else if {
				(second_highest < number[i])
			}
			
	}
		
	}
	
}
