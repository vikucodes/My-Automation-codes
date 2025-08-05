package DailyUpdate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays_09012024 {

	public static void main(String[] args) {
		
		//addition even and odd
		
		/*int [] arr= {10,11,12,13,14,15,16,17,18};
		
		int even_no=0;
		
		int odd_no=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2!=0) {
				
				odd_no=odd_no+arr[i];
				
			}else if(arr[i]%2==0){
				
				even_no=even_no+arr[i];
			}
		}
		
System.out.println("addition of even :"+ " "+even_no);
System.out.println("addition of odd :"+" "+odd_no);
		
		//common array
		
		int [] arr= {10,11,12,12,14,15,16,16,11};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				
				if(arr[i]==arr[j]) {
					
					arr[i]=arr[j];
					
					System.out.println("common array is :" +arr[i]+ " at position "+i+" second position"+" "+j);
				}
				
			}
		}
		
		
		
		//copy one array into other reverse order
		
		int [] a= {10,15,16,18,19};
		
		int [] b=new int[5];
		
		for(int i=0,j=a.length-1;j>=0;i++ ,j--) {
			
			b[j]=a[i];
		}
		System.out.println(Arrays.toString(b));
		
		//initialise 10 digit array
		
		int [] a=new int [10];
		
		for(int i=0;i<10;i++) {
			
			System.out.println(i);
		}
		
		
		//merger two array in sort
		 //need to see again
		
		int [] a= {1,5,2,6,3,4,6,3,8};
		
		int [] b= {7,8,5,6,5,2,12,36,45};
		
	 int [] merged=new int [a.length + b.length];
	 
	 Arrays.sort(merged);
		
           System.out.println(merged);
		
		//missing no.
		
		int [] a= {1,2,3,5,6};
		
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			
			sum=sum+a[i];
			
			
		}
           System.out.println("sum of array :"+ " "+ sum);
           
           
           int sum1=0;
           
           for(int i=1;i<=6;i++) {
        	   
        	   sum1+=i;
           }
           
           System.out.println(sum1);
           
           System.out.println("misisng no is :"+ " "+(sum1-sum));
		
		//occurance of specific array
		
		int [] a= {10,15,16,10,19,15};
		
		int dup=15;
		
		int count=0;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==dup) {
				count++;
				dup=a[i];
				
				
				System.out.println(a[i]+ " " + i + " ");  
			}
		}
       System.out.println(count); 
		
		//remove element
		
		int[]a= {10,20,30,40,50,60};
		
		
		

		
	List list=new ArrayList();
	
	for(int name:a) {
		
		list.add(name);
	}
		list.remove(Integer.valueOf(20));
	
		System.out.println(list);
		
		 int[] newArray = new int[list.size()];
	        for (int i = 0; i < list.size(); i++) {
	            newArray[i] = (int) list.get(i);
	        }

	        // Print the new array
	        System.out.println("Array after removing 20: " + Arrays.toString(newArray));*/
		
		//sort array without sorting
		
		int [] a= {10,5,2,11,15};
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<a[i+1]) {
				
				 int dup=a[i+1];
				 a[i]=a[i+1];
				 a[i+1]=dup;
				System.out.println(a[i]);
			}
		}
	    }
	
		
	}
	
	
	
	






		
		//find dup
		
		
		
		
		
		
		//find length without length method
		//third highest