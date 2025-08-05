package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class findduplicateno {

	public static void main(String[] args) {
		
		int [] input= {10,20,22,34,10,34,66,22,55,10,66,19};
		//1st approach
		for (int i = 0; i < input.length; i++) {
			for (int j = i+1; j < input.length; j++) {
				
				if(input [i]== input [j]) {
				
					System.out.println(input[i]+" "+i);
					
				}
				
			}
		/*HashSet<Integer> org=new HashSet<Integer>();
		HashSet<Integer> dup=new HashSet<Integer>();
		
		for(Integer Num:input) {
			if(!dup.add(Num)) {
				dup=org;
				System.out.println(org);
		
		  Set<Integer>set=new HashSet<Integer>();
		  
		  set.add(10);
		  set.add(15);
		  set.add(10);
		  set.add(15);
		  set.add(20);
		  set.add(15);
		  ArrayList<Integer>list=new ArrayList<Integer>(set);
		  
		  list.add(10);
		  list.add(15);
		  list.add(10);
		  list.add(15);
		  list.add(20);
		  list.add(15);
		  Collections.sort(list);
		  System.out.println(list);*/
			}
			
			
			
		

	}
}



