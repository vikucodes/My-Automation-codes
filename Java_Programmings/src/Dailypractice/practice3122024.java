package Dailypractice;

import java.util.HashSet;
import java.util.Set;

public class practice3122024 {

	public static void main(String[] args) {
		
		String word="common array";
		
		char [] a=word.toCharArray();
		
		Set <Character>dup=new HashSet<Character>();
		for(int i=0;i<word.length();i++) {
			
			for(int j=i+1;j<word.length();j++) {
				
				if(a[i]==a[j]) {
					
					a[i]=a[j];
					
					dup.add(a[i]);
				}
			}
		}
		
		System.out.println(dup);
		

	}

}
