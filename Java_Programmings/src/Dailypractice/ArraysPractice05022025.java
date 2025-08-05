package Dailypractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraysPractice05022025 {

	public static void main(String[] args) {
		
//1 find the duplicate
		
		/*int [] a= {10,12,14,10,12,15,16,1};
		
		Set<Integer> set=new HashSet<Integer>();
		
	    for(int arr:a) {
		set.add(arr);
		
		}
		
		
		System.out.println(set);*/
		
		//2 addition of even and odd
		
	/*	int [] a= {10,12,14,10,12,15,16,1};
		
		int even_total=0;
		int odd_total=0;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2==0) {
				
				even_total+=a[i];
				
			}else {
				
				odd_total+=a[i];
			}
		}
		
		System.out.println("total sum of even no. is : "+even_total);
		
		System.out.println("total sum of odd no is : "+odd_total);
		*/
		
		
		// 3 initialize 10 digit
		
	/*	int [] a=new int[10];
		
		for(int i=1;i<10;i++) {
			
		System.out.println(i);	
		}*/
		
		
		// 4 merger two array in sort order
		/* int [] a= {1,2,5,6,8};
		 
		 int [] b= {3,9,7,5,12,11};
		 
		 int [] c=new int[a.length+b.length];
		 
		 for(int i=0;i<a.length;i++) {
			 
			 c[i]=a[i];
			 
			 for(int j=0;j<b.length;j++) {
				 
				 c[j+a.length]=b[j];
			 }
		 }
		 Arrays.sort(c);
		 System.out.println(Arrays.toString(c));
		 */
			}

}
