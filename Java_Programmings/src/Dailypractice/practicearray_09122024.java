package Dailypractice;

import java.util.Arrays;

public class practicearray_09122024 {

	public static void main(String[] args) {
		
		int [] arr= {10,20,30,40,50,900,855,452};
		
		/*int max=0;
		int third_max=0;
		int sec_max=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				third_max=sec_max;
				sec_max=max;
				max=arr[i];
				
			}else if(arr[i]>sec_max) {
				third_max=sec_max;
				sec_max=arr[i];
				
			}else if(arr[i]>third_max) {
				third_max=arr[i];
			}
		}
				

	
System.out.println(third_max);
System.out.println(sec_max);
System.out.println(max);*/
		
		//2 some of all arrays
		
		/*int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			
		sum+=arr[i];	
		}
		
		System.out.println(sum);*/
		
		//3 average of all element in an array
		/*int sum=0;
		
		int avg=0;
		for(int i=0;i<arr.length;i++) {
			
			sum+=arr[i];
			
			 avg=sum/arr.length;
			
			
		}
		System.out.println(avg);*/
		
		//4.reverse an array
		
		/*for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);*/
		
		//5.check array is sorted in ascending order
		
		/*Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<arr[i+1]) {
				System.out.println("arrays is sorted in ascending order");
			}else {
				System.out.println("arrays are descending order");
			}
		}*/
	}
}
