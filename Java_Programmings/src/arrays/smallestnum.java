package arrays;

import java.util.Arrays;

public class smallestnum {

	public static void main(String[] args) {
		
		int [] n= {10,12,32,56,26,85};
		
		int SmallestNum=n[0];
		int LargestNum=n[0];
		Arrays.sort(n);
		
		for(int i=0;i<n.length;i++) {
			if(LargestNum<n[i]) {
				LargestNum=n[i];
			}else if(SmallestNum>n[i])
				SmallestNum=n[i];
				
			}
		System.out.println(LargestNum+ " " +SmallestNum);
		}
		
	}
	


