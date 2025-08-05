package Dailypractice;

import java.util.Arrays;

public class practice280824 {

	public static void main(String[] args) {
		
		int [] a= {10,45,12,52,63,24,26,35,95};
		
		/*int thirdno=a[0];
		
		
	      Arrays.sort(a);
		System.out.println(a);
		
		for(int i=0;i<a.length-2;i++) {
			if(thirdno<a[i]) {
		 
		 thirdno=a[i];
			
			}
			
			//System.out.println(thirdno);
		}
		
		System.out.println(thirdno);*/
		Arrays.sort(a);
	int	maxno=a[0];
	int minno=a[0];
	
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		if(maxno<a[i]) {
			maxno=a[i];
		}else if(minno>a[i]) {
			minno=a[i];
		}
	}
	System.out.println(minno+" "+maxno);
	
	}

}