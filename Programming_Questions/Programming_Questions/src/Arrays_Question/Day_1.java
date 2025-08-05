package Arrays_Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day_1 {

	public static void main(String[] args) {
		
		//find the 3rd highest
		
	/*	int [] arr= {11,5,4,8,96,44,26,59,36};
		
		int thirst_max=arr[0];
		int sec_max=arr[0];
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				thirst_max=sec_max;
				sec_max=max;
				max=arr[i];
				
			}else if(arr[i]>sec_max) {
				
				thirst_max=sec_max;
				sec_max=arr[i];
			}else if(arr[i]>thirst_max) {
				thirst_max=arr[i];
			}
			
		}
		
		System.out.println(thirst_max);
		System.out.println(max);
		System.out.println(sec_max);*/
		
		//  addition of even and odd
		
	/*	int [] arr= {10,11,2,3,4,5,6,7,8,9};
		
		int even=0;
		int odd=0;
		
		for(int i=0;i<arr.length;i++) {
			
			int sum=0;
			if(arr[i]%2==0) {
				
				even+=arr[i];
				//System.out.println(even);
				
				
				
			}else {
				
			odd+=arr[i];
				//System.out.println(odd);
			}
		}
		System.out.println(even);
		System.out.println(odd);
		*/
		
		// remove common array
		
		/*int [] arr= {10,10,20,25,26,20,9,};
		
		int dup=0;
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int s:arr) {
			
			set.add(s);
		}
		
		System.out.println(set);*/
		
		// find duplicates
		
	
		     /*   int[] arr = {10, 15, 20, 20, 15, 6, 9, 3, 8, 5, 5};
		        
		        HashSet<Integer> seen = new HashSet<>();
		        System.out.println("Duplicates in the array:");
		        
		        for (int num : arr) {
		            if (seen.contains(num)) {
		                System.out.println(num);
		            } else {
		                seen.add(num);
		            }
		        }
		        */
		      
		  // merge two array in sort order
		
	/*	int [] a= {10,15,12,11,26,23};
		
		int [] b= {12,15,6,89,13,796,7};
		
		int[] c=new int [a.length+b.length];
		
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
	
		}
		for(int j=0;j<b.length;j++) {
			
			c[a.length +j]=b[j];
		}
	Arrays.sort(c);
	System.out.println(Arrays.toString(c));
	*/
		
		// check if an array is palindrome
		
	/*	int [] a= {10,12,16,13,51};
		
			
		Arrays.asList(a);
		
		List<Integer> list=new ArrayList<Integer>();
		
		for(int rev:a) {
			list.add(rev);
		}
		Collections.reverse(list);
		
		for(int c:list) {
			System.out.println(c);
			
		boolean d=	a.equals(c);
		
		System.out.println(d);
		}
*/
		
		//find the union of 2 array
		
		int [] a= {10,15,23,10,26,14};
		
		int [] b= {14,48,65,21,46,3};
		
	Arrays.sort(a );
	Arrays.sort(b);
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int value_a:a) {
			
			set.add(value_a);
		
		}
		
		
		for(int value_b:b) {
			
			set.add(value_b);
		}
		
		System.out.println(set);
		List<Integer> list=new ArrayList<Integer>(set);
		
		Collections.sort(list);
		
	
			
			
		
		
		System.out.println(list);
		
		    }
		}

