package DailyUpdate;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Array_22012024 {

	public static void main(String[] args) {
		//remove duplicate from integer array
		/*int [] arr= {10,10,20,10,25,26,23,52,0,10,20};

	    Set <Integer> set=new HashSet<Integer>();
	    
	    for(int w:arr) {
	    	set.add(w);
	    }
	    System.out.println(set);
	    */
		
		//2 remove duplicate string from array
		
		/*String [] arr={"banana","banana", "mango" ,"grapes","grapes"};
		
		
		Set <String> set=new HashSet<String>(Arrays.asList(arr));
		
		System.out.println(set);*/
		
		//3 find the length of array without length method
		
		int [] arr= {21,16,0,56,25,36,2,5,6,26,8};
		
		int length=0;
		for(int value:arr) {
			
			length++;
		
		}
	
		System.out.println(length);
		
		//4 find the 3rd highest no.
		
		/*int [] arr= {10,16,0,56,25,36,2,5,6,26,8};
		
		int highest=0;
		int second_highest=0;
		int third_highest=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>highest) {
				
				second_highest=third_highest;
				third_highest=highest;
				highest=arr[i];
				
			}else if(arr[i]>second_highest) {
				
				third_highest=second_highest;
				second_highest=arr[i];
				
			}else if(arr[i]>third_highest) {
				third_highest=arr[i];
			}
		}
		
		System.out.println(third_highest);
		System.out.println(second_highest);
		System.out.println(highest);*/
		//5 Rotate the array from 5th position
		
	/*	int [] arr= {10,16,0,56,25,36,2,5,6,26,8};
		
		for(int i=arr.length-1,j=0;i>=4;i--,j++) {
			
			System.out.println(arr[i]+" "+arr[j]);
			
		}*/
		
		// 6 addition of even and odd together
		
	/*	int [] arr= {1,2,3,4,5,6,7,8,9};
		
		int even_no=0;
		int odd_no=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2==0) {
				
				even_no+=arr[i];
			}else {
				
				odd_no+=arr[i];
				System.out.println(arr[i]);
			}
		}
		
		System.out.println(even_no);
		System.out.println(odd_no);*/
		
		
		//7 find the common array
		
	/*	int [] arr= {1,1,2,6,4,5,2,6,3,5};
		
		int dup=0;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
			
			if(arr[i]==arr[j] ){
				
				arr[i]=arr[j];
				dup=arr[j];
				System.out.println(dup);
			}
				
			}
			
		}
		//System.out.println(dup);
		
		//  8 remove duplicate array*/
		
		
		/*int [] arr= {1,2,3,5,2,1,6,8,9,7,5};
		
		Set<Integer> set=new HashSet<Integer>();
		for(int w:arr) {
			set.add(w);
		}
		System.out.println(set);*/
		
		
		// 9 remove duplicate string
		
		/*String [] name= {"john" ,"charles" ,"john", "king","lome","king"};
		
		
		Set <String> set=new HashSet<String>(Arrays.asList(name));
		
		System.out.println(set);*/
		
		//9 copy one array into new array in reverse format
		
	/*int [] arr= {1,2,3,4,5,6};
		
		int [] a=new int [6];
		
		
		for(int i=0, j=arr.length-1 ; j>=0 ;i++, j--) {
			
			a[i]=arr[j];
			System.out.println(a[i]);*/
		
		//10 initialise 10 digit array
		
	/*	int [] a=new int [10];
		
		int count=0;
		for(int i=0;i<=10;i++) {
			count++;
			System.out.println(count);
			
			
			
			
		}*/
		
		// 11 find max and min value
		
		/*int [] a= {10,20,30,40,50,8,80,9,46};
		
		int max=a[0];
		int min=a[0];
		
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max) {
				max=a[i];
			}
		else if(a[i]<min) {
			
			min=a[i];
		}
			
		}
		
		System.out.println("min value is :"+" "+min);
		
		System.out.println("max value is :"+" "+max);*/
		
		//12 merge two array in sort
		
		int [] a= {10,20,30,40,50,8,80,9,46};
		int [] b= {110,200,3,4,5,6};
		
		int [] c=new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++) {
			
			c[i]=a[i];
		}
 		
		for(int j=0;j<b.length;j++) {
			
			c[j+a.length]=b[j];
		}
		
		
	System.out.println(Arrays.toString(c));
	
	Arrays.sort(c);
	
	System.out.println(Arrays.toString(c));
		
	}
}
