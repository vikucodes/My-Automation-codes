package DailyUpdate;

import java.util.Arrays;

public class day4 {

	public static void main(String[] args) {
		//1 reverse a string
		
		/*String name="john";
		
		String result="";
		
		char ch;
		
		for(int i=name.length()-1;i>=0;i--) {
			
			result=result+name.charAt(i);
		}
		
		System.out.println(result);*/
		
		//2 reverse a each word
		
		/*String word="john and charles are two brother from another mother";
		
		String [] word1=word.split(" ");
		
		String result="";
		
		char ch;
		
		for(String name:word1) {
			
			String rev="";
			
			for(int i=name.length()-1;i>=0;i--) {
				
				
				rev=rev +name.charAt(i)+"";
			}
			result=result+rev +" ";
		}
		
		System.out.println(result);*/
		
		//3 check if string is palindrome or not
		/*
		String name="madam";
		
		String res="";
		
		char ch;
		
		for(int i=name.length()-1;i>=0;i--) {
			
			res=res+name.charAt(i);
		}
			if(res.equals(res)) {
				
				System.out.println("it is palindrome");
			}else {
				System.out.println("it is not palindrome");
			}*/
		
		//4 count occurance of character
		
	/*	String name="programming";
		
		int value=0;
		
		for(int i=0;i<name.length()-1;i++) {
			
			if(name.charAt(i)=='r') {
				
				value++;
			}
		}
		System.out.println(value);*/
		
		
		//5 find length of string without length method;
		
		/*String name="King";
		
		int length=0;
		
		for(char ch: name.toCharArray()) {
			
			length++;
			
		}
		
		System.out.println(length);*/
		//6 given string anagrams or not
	/*	String word="listen";
		String word1="silent";
		
		
		char [] name=word.toCharArray();
		char []name1=word1.toCharArray();
		
		Arrays.sort(name);
		Arrays.sort(name1);
		
		if(Arrays.equals(name, name1)) {
			System.out.println("given string are anagrams");
		}else {
			System.out.println("given string are non anagrams");
		}*/
		
		//7 remove duplicates from string
		
	/*	String word="programming";
		
		String after="";
		
		char [] dup=word.toCharArray();
		
		//for(char value:dup) {
			
			for(int i=0;i<dup.length;i++) {
				
			
			
			if(dup.equals(-1)) {
				
				dup[i]++;
			}
			System.out.println(dup);
		}*/
		
		//8 find middle character
		
//		String name="vikas";
//		
//		int len=name.length();
//		
//        System.out.println("name.charAt(len/2-1)"+" "+name.charAt(len/2));
//		
		//9 find longest string
		
		/*String input="john and charles are not enemy";
		
		String [] value=input.split(" ");
		
		String gretest="";
	
		
		for(String name:value) {
			
	      if(name.length()>gretest.length()) {
	    	  
	    	  gretest=name;
			
		}
				
				
			
					
				}
		System.out.println(gretest);*/
		
		//10 convert a string to integer
		
	/*	String name="Sudeep";
		 
	char[] ch=	name.toCharArray();
	
	
		
		System.out.println(ch);*/
		
		//11 find the last occurance of string
		
		/*String name="hey sinamika where are you";
		
	//	String [] splitted=name.split(" ");
		
		
		
		char ch='e';
		
		int count = 0;
		for(int i=0;i<name.length();i++) {
			
		

			if(name.charAt(i)==ch) {
				count++;
			System.out.println(	name.indexOf(i));
				
			}
				
			
		}
		
	System.out.println(count+" " +ch+" "+name.lastIndexOf(ch));*/
		
		//12 remove substring from string
		
		String name="john and charles";
		int count=0;
		//String [] word=name.split(" ");
		
		char ch='a';
		
		for(int i=0;i<name.length();i++) {
			
		
		if(name.charAt(i)==ch) {
			
			 count++;	
			System.out.println("position is : " + (i+1));
		}
		
		
	}System.out.println(count );	
}

}	
				
				
			
			
			
		
		
	
		


