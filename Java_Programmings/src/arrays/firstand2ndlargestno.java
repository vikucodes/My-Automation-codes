package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class firstand2ndlargestno {

	public static void main(String[] args) {
		int [] n= {10,12,32,56,26,85};
		/*int secondLargestNum=0; 
		int LargestNum=0;
		for(int i=0; i<n.length; i++) {
			if(LargestNum < n[i]) {
				secondLargestNum=LargestNum;
				LargestNum = n[i];
			}else if(secondLargestNum<n[i])
				secondLargestNum=n[i];
			
		}
		System.out.println(secondLargestNum +" " + LargestNum);*/
		int SmallestNum=0;
		int LargestNum=0;
		for(int i=0; i<n.length; i++) {
			if(LargestNum < n[i]) {
				SmallestNum=LargestNum;
				LargestNum = n[i];
			}else if(SmallestNum<n[i])
				SmallestNum=n[i];
		
		
		}
		System.out.println(SmallestNum);
	}
		
}

