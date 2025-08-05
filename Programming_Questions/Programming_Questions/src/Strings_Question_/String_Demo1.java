package Strings_Question_;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class String_Demo1 {

	public static void main(String[] args) {
		/*String input="java is just a language";
		
		String output="";
		
		int vowel=0;
		
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				
				vowel++;
				
				System.out.println("at which point :"+ i);
			}
		}
		
		System.out.println(vowel);*/
		
		// count each character
		
		/*String input="character";
		
		char [] ch=input.toCharArray();
		
		Map<Character ,Integer> map=new HashMap<>();
		
		for(char arr:ch) {
			
			if(map.containsKey(arr)) {
				
				map.put(arr, map.get(arr)+1);
			}else {
				
				map.put(arr, 1);
			}
			
			
		}
		
		System.out.println(map);*/
		
		// count each word
		
	/*	String input="java bun java python csharp bun jino king python";
		
		String [] str=input.split(" ");
		
		Map<String ,Integer> map=new HashMap<>();
		
		for(String word:str) {
			
			if(map.containsKey(word)) {
				
				map.put(word, map.get(word)+1);
			}else {
				map.put(word, 1);
			}
		}
		System.out.println(map);*/
		//remove duplicate from string
		
		/*String name="java bun java python csharp bun jino king python";
		String [] str=name.split(" ");
		
	   Set <String> set=new HashSet<>();
	   
	   for(String dup:str) {
		   
		   set.add(dup);
			
        
		}
	   
	   System.out.println(set);*/
		
		// find the duplicate
	/*	
		String name="java bun java python csharp bun jino king python";
		
	
	    int value=	Integer.parseInt(name);
		
		System.out.println(value);*/
		
	/*	String value="123456789";
		
		System.out.println(Integer.parseInt(value));*/
		
		
	
		}
		
       
		
		
			
	
		
	
		
	}


