package Dailypractice;

import java.util.Arrays;

public class practice271124 {

	public static void main(String[] args) {
	 
		//average of array
		
		/*int [] arr= {10,20,30,40,50};
		
		int sum=0;
		int avg=0;
		for(int i=0;i<arr.length;i++) {
			
			sum+=arr[i];
		
         avg=sum/arr.length;
		}
		System.out.println(sum); 
		System.out.println(avg);*/
		
		
		//sort an array without sorting
		
		int [] arr1= {1,3,8,5,4,2,7,6};
		
		for(int i=0;i<arr1.length;i++) {
			
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]>arr1[j] ){
					
					int t=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=t;
					
				//System.out.println(arr1[i]+ " ");	
					
					
			
		
			
				}
		
			}
	}
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		}

}
