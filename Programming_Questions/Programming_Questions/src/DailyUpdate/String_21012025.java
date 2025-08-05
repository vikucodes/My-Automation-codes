package DailyUpdate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class String_21012025 {

	public static void main(String[] args) {
		
		//1 reverse the string
		
		/*String name="java is a core language";
		
		String reverse="";
		
		char ch;
		
		for(int i=0;i<name.length();i++) {
			
			reverse=name.charAt(i)+reverse;
		}
		
		System.out.println(reverse);*/
		
		//2 reverse each string at same point
		
		/*String name="java is a core language";
		
		String [] brk=name.split(" ");
		
		String reverse="";
		
		char ch;
		
		for(String word:brk) {
			
			String rev="";
		
		
		for(int i=0;i<word.length();i++) {
			
			rev=word.charAt(i)+rev;
			
			
			
		}
		reverse=reverse+rev+" ";
	}
System.out.println(reverse);*/
		
		//3 reverse a particular word
		
		/*String name="java is a core language";
		
        String [] brk=name.split(" ");
		
		String reverse="";
		
		String particular="core";
		
        for(String word:brk) {
				
		if(word.equals(particular)) {
			String rev="";
		
			for(int i=0;i<particular.length();i++) {
				
				rev=particular.charAt(i)+rev;
			}
			reverse=reverse+rev+" ";
			
			}else {
				reverse=reverse+word +" ";
			}
		
		}
		
		
		System.out.println(reverse);	*/
		
		//4 find the frequency of character
		
		/*String name="java";
		
		char ch='a';
		
		int count=0;
		for(int i=0;i<name.length();i++) {
			
			if(name.charAt(i)==ch) {
				
				count++;
			}
		}
		
		System.out.println("total count of a:"+" "+ count);*/
		
		//5 frequency of each character
		/*String word="john is a wholy person";
		word.trim();
		
		Map<Character , Integer> map=new HashMap<>();
		
		for(char ch:word.toCharArray()) {
			
			if(map.containsKey(ch)) {
				
				map.put(ch, map.get(ch)+1);
			}else {
				
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		//System.out.println(word.trim());*/
		
		//6 replace 1st character with last character and vice versa for each string
		
	/*	String name="java compiler";
		
		if(name!=null && name.length()>1) {
			char firstchar=name.charAt(0);
			char lastchar=name.charAt(name.length()-1);
			
			String modifiedname=lastchar+name.substring(0 ,name.length()-1)+firstchar;
			System.out.println(modifiedname);
				
		}
		else {
			System.out.println(name);
		}*/
		
		//7 find the alphabet
		
	/*	String name="john123";
		
		/*int alpha=0;
		
	String p=name.replaceAll("[0-9]","");
				
		int len=p.length();
				
	System.out.println(len);
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(Character.isAlphabetic(name.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);*/
		
		/*String name="java python compiler john";
		
	
		
		String[] split = name.split(" ");
        String rev = "";
        
        String word1 = "john";
        String word2 = "java";
        
        for (String word : split) {
            String reverse = "";
            
            if (word.equals(word1)) {
                for (int i = word1.length() - 1; i >= 0; i--) {
                    reverse += word1.charAt(i);
                }
            } else if (word.equals(word2)) {
                for (int i = word2.length() - 1; i >= 0; i--) {
                    reverse += word2.charAt(i);
                }
            } else {
                reverse = word;
            }
            
            rev += reverse + " ";
        }
        
        System.out.println(rev.trim());*/
		
		
		//reverse the Arrays
		
		int [] a= {10,15,12,36,26,745,7};
		
		int rev=0;
		
		for(int i=a.length-1;i>=0;i--)
		{
			rev=a[i];
			System.out.println(a[i]);
		
		}
		 
    }
}