package Strings_Question_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class String_Demo_2 {

	public static void main(String[] args) {

		 //Count vowel
		
		String name="java and python";
		
		
		char ch;
		int count_vowel=0;
		int count_consonant=0;
		
		for(int i=0;i<name.length();i++) {
			ch=name.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				
				count_vowel++;
				
			
				
				
			}else {
				
				count_consonant++;
			}
			
		
		
		
			
			//count_vowel++;
	
		}
		
		System.out.println("count of vowel :  " +count_vowel);
		System.out.println("count of consonant :"+ count_consonant);
		
		
		// Occurrence of character
		
	/*	String name="java and python";
		
		char target='a';
		int count=0;
		
		for(int i=0;i<name.length();i++) {
			
			if(name.charAt(i)==target) {
				count++;
				
			}
		}
		
		System.out.println("total count of a : "+count);*/
		
		// count upper case and lower case 
		
	/*	String name="Java YOur anD RythM";
		
		
		int count_upper=0;
		int count_lower=0;
		char ch;
		
		for(int i=0;i<name.length();i++) {
			
			ch=name.charAt(i);
			
			if(Character.isLowerCase(ch)) {
				count_lower++;
				
			}else if(Character.isUpperCase(ch)) {
				
				count_upper++;
			}
		}
		
		System.out.println("Lower Case count is :"+count_lower);
		System.out.println("Upper Case count is :"+count_upper);*/
		
		// Anagrams of String
		
	/*	String name="Silent";
		
		String name1="Listen";
		
	String g=	name.toLowerCase();
	String g1=	name1.toLowerCase();
		
	char [] ch=	g.toCharArray();
	char [] ch1=	g1.toCharArray();
	
	Arrays.sort(ch);
	Arrays.sort(ch1);
	
	if(Arrays.equals(ch1, ch)) {
		
		System.out.println("given string is anagrams");
		
	}else if(!Arrays.equals(ch1, ch)) {
		
		System.out.println("given String is non Anagrams");
	}
	
	*/
	List<Integer> list=new ArrayList<> ();
	
	list.add(10);
	list.add(25);
	list.add(98);
	list.add(5);
	list.add(19);
	

System.out.println(Collections.min(list));
	Collections.max(list);
	
		
			}
			
		
		}
		
	
	


