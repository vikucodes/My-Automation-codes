package Dailypractice;

import java.util.Arrays;

public class array10092024 {

	public static void main(String[] args) {
		int [] a= {10,20,30,35,61,65,630,67};
		//Find 2nd largest no.
		
		/*int second_largest_no=0;
		int largest_no=0;
		
		for(int i=0;i<a.length;i++) {
			
			if(largest_no<a[i]) {
				second_largest_no =largest_no;
				largest_no=a[i];
			}else if(second_largest_no>a[i]) {
				second_largest_no=a[i];

				
			}
		}
		
		System.out.println(second_largest_no);
	}*/
		
	Arrays.sort(a);	
	int thirdno=0;
	int largest=0;
	for(int i=0;i<a.length-2;i++) {
		
		if(largest<a[i]) {
			largest=thirdno;
           thirdno=a[i];
		}
	}
	System.out.println(thirdno);
	}
}
