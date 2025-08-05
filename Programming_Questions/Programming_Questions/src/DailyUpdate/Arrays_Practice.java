package DailyUpdate;

import java.util.HashSet;
import java.util.Set;

public class Arrays_Practice {

	public static void main(String[] args) {
		//1 merge two array in sort order
		
		/*
		int[] a= {15,89,16,1,19,18};
		
		int [] b= {19,45,84,13,11,5};
		
		int [] c= new int [a.length + b.length];
		
		for(int i=0;i<a.length;i++) {
			
			c[i]=a[i];
			
		
		}
		
		for(int j=0;j<b.length;j++) {
			
			c[a.length+j]=b[j];
		}
 		
		Arrays.sort(c);
		
		
		System.out.println(Arrays.toString(c));
		*/
		
		//2 calculate some of array
		
	/*	int [] a= {10,20,30,40};
		
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			
			sum+=a[i];
		}
		
		System.out.println(sum);*/
		
		//3 Find the average of the array elements.
		
	/*	int [] a= {10,20,30,40};
		
        int sum=0;
        int avg=0;
		
		for(int i=0;i<a.length;i++) {
			
			sum+=a[i];
	}
		
		avg=sum/a.length;
		
		System.out.println(avg);*/
		
		// 4 find the max and min
		
		/*int [] a= {10,8,30,40};
		
		int max=a[0];
		int min=a[0];

		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max) {
				
				max=a[i];
				
				
			}else if(a[i]<min) {
				
				min=a[i];
			}
			
		}
		
		System.out.println("min value is :"+min);
		System.out.println("max value is :" +max);*/
		
		// 5 find the 2nd highest 
		
		/*int [] a= {10,15,12,14,16,18,166,9};
		
		int max=a[0];
		int sec_max=a[0];
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max) {
				sec_max=max;
				max=a[i];
			}else if(a[i]>sec_max) {
				
				sec_max=a[i];
			}
		}
		
		System.out.println("second max value is "+sec_max);*/
		
		//6 find the common no.
		
	/*	int [] a= {1,2,3,4,5,6};
		int [] b= {2,3,5,1,9,8};
		int dup=0;
		
		for(int i=0;i<a.length;i++) {
			for (int j=0;j<b.length;j++) {
				
				if(a[i]==b[j]) {
					
			
				
				
				System.out.println(b[j]);
				
				}
				
			}
				
			
			}
		
		*/
		
		//7 remove duplicate value

			int [] a= {1,2,3,4,5,6};
			int [] b= {2,3,5,1,9,8};
			
			Set<Integer> set=new HashSet<Integer>();
			
			for(int s:a) {
				
				set.add(s);
				
			
			}
			//System.out.println(set);
			
			for(int s1:b) {
				
				set.add(s1);
			}
			
			System.out.println(set);
		
		}
		
		
	
}
