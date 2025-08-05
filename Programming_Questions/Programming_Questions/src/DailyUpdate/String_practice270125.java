package DailyUpdate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class String_practice270125 {

	public static void main(String[] args) {
		
		// 1 check the given string is anagrams or not
		
		/*String arr="listen";
		String arr2="silent";
		
	char []	a=arr.toCharArray();
	char []	 b=arr2.toCharArray();
	
	Arrays.sort(a);
	Arrays.sort(b);
	
	
	if(Arrays.equals(a, b)) {
		
		System.out.println("it is anagrams");
	}
		
	else {
		System.out.println("it is non anagrams");
	}*/
		
		// 2 palindrome check
		/*
		String name="madam";
		String name1="madam";
		
		
	char[] a=name.toCharArray();
	char [] b=name1.toCharArray();
	
	
	if(Arrays.equals(a, b)) {
		
		System.out.println("palindrome");
	}
	else {
		System.out.println("non palindrome");
	}
	*/
		
	/*	//3  reverse a particular word
		
		String name="hellow charles how are you";
		
		String [] name1=name.split(" ");
		
		
		String rev_word="charles";
		
		String result="";
		
		char ch;
		
		for(String name2:name1) {
			
			String rev="";
			
			if(name2.equals(rev_word)) {
				
				for(int i=0;i<rev_word.length();i++) {
					
					rev=name2.charAt(i)+rev;
					
				}
			}
			else {
				
				rev+=name2;
			}
			
			result=result+rev+" ";
		}
		System.out.println(result);
		*/
		
		
		//4 find the largest string
		
		/*String name="hellow charles how are you";
		
		String [] split=name.split(" ");
		
		String lent="";
		
		for(String name1:split) {
			
			if(name1.length()>lent.length()) {
				
				lent=name1;
				
			}
		}		
		System.out.println(lent.length());
		System.out.println(lent);*/
		
		
		// 5 reverse 2 string
		
		
	/*	String name="john charles devid cap";
		
		
		String [] a=name.split(" ");
		
		String target_word="john";
		
		String target_word2="cap";
		
		String result="";
		
		char ch;
		
		for(String rev:a) {
			
			String rev_word="";
			
			if(rev.equals(target_word) || rev.equals(target_word2)) {
				
			for(int i=0;i<rev.length();i++) {
					
			
						
			rev_word=rev.charAt(i)+rev_word ;
						
					}
				
			}else {
				
				rev_word+=rev;
		}
		result+=rev_word+" ";
		}
		System.out.println(result);
		*/
		// 6 switch first and last string in reverse
		
	/*String word="john sena cristian landing";
		
		String[] split =word.split(" ");
		
		String first_word=split[0];
		
		String second_word=split[split.length-1];
		
		String revf="";
		
		for(int i=0;i<first_word.length();i++) {
			
			revf=first_word.charAt(i)+revf;
		}
		String revl="";
		for(int i=0;i<second_word.length();i++) {
			
			revl=second_word.charAt(i)+revl;
		}
		
		split[0]=revl;
		split[split.length-1]=revf;
		
		 String result = String.join(" ", split);
		
		
		
		System.out.println(result);*/
	
		
		// 7 reverse each word in the string
		
	/*	String word="mango grapes fruits banana guava";
		
		String [] a=word.split(" ");
		
		String res="";
		
		char ch ;
		for(String name:a) {
			
			String rev_result="";
			
			for(int i=name.length()-1;i>=0;i--) {
				
			
					
					rev_result=rev_result+name.charAt(i);
					
				}
			
			res=res+rev_result+" ";
		}
		
		System.out.println(res);*/
		
		// 8 frequency of each character
		
	/*	String name="character";
		
		char [] a=name.toCharArray();
		
		
		Map<Character , Integer> map= new HashMap<>();
		
		for(char ch:a) {
			
			if(map.containsKey(ch)) {
				
				map.put(ch, map.get(ch)+1);
			}else {
				
				map.put(ch, 1);
			}
		}
		
		System.out.println(map);*/
		
		
		// 9 switch the string word
		
	/*	String java="name same";
		
		String word="johny fame";
		
String [] splitted_word= java.split(" ") ;
String splitted_word1 []=word.split(" ");

String res=splitted_word[0]+" "+splitted_word1[0];
String res1=splitted_word[1]+ " "+splitted_word1[1];

System.out.println(res);

System.out.println(res1);
		*/
		
		//10 check two String are anagroms
		
	/*	String a="Listen";
		String b="Silent";
		
	String a1=	a.toLowerCase();
	String b1=	b.toLowerCase();
		
		char [] ch=a1.toCharArray();
		
		char [] ch1=b1.toCharArray();
		
		
		Arrays.sort(ch1);
		Arrays.sort(ch);
		
		
		
		if(Arrays.equals(ch1, ch)) {
			System.out.println("it is anagroms");
		}else {
			System.out.println("it is non angroms");
		}
		*/
		
		// 11 reverse each word of string at same position
		
	/*	String name="java phone simple code hellow";
		
		String [] name1=name.split(" ");
		
		String final_result="";
		
		
		for(String word:name1) {
			
			String rev="";
			
			for(int i=0;i<word.length();i++) {
				
				rev=word.charAt(i) +rev;
			}
			
			final_result=final_result+rev+" ";
		}
		
		

		
		
		
		System.out.println(final_result);
	*/
		
		
		// 12 find the first non repetative character of string
		
	/*	String name="swiss";
		
		char [] ch=name.toCharArray();
	Map <Character ,Integer> mp=new HashMap<>();
	
	for(char a:ch) {
		if(mp.containsKey(a)) {
			
			mp.put(a, mp.get(a)+1);
		}else {
			
			mp.put(a, 1);
		}
	}
	
	System.out.println(mp);
	for(char a: ch) {
		if(mp.get(a)==1) {
			System.out.println(a);
		}
	}

*/
		
		//13 find the duplicate value
		
	/*	int [] arr= {11,15,12,11,10,19,10};
		
		int count=0;
		
		
		Set<Integer> set=new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(!set.add(arr[i])) {
				
				System.out.println(arr[i]);
			}
		}
		*/
		
		//14 remove special character and get only alphabet
		
	/*	String name="jo12hn 676sin768a";
		
		String result="";
		
		char ch;
		
		for(int i=0;i<name.length();i++) {
			
			ch=name.charAt(i);
			
			if(!Character.isDigit(ch)) {
				
				result=result+name.charAt(i);
			
		
			}
		}
		
		System.out.println(result);*/
		
		// 15 remove all occurance 
	/*	String a="programming";
		
		char [] arr=a.toCharArray();
		
		Set<Character> set=new HashSet<>();
		
		for(char arr1:arr) {
			
			set.add(arr1);
		//	set.remove('g');
		
		}
		
	//	System.out.println(set);
		
	//	set.toArray();
		System.out.println(set);*/
		
		//16 occurance of character
		
		/*String name="programming";
		
		int len=name.length();
		
		String  sp=name.replace("g", "");
		
		int len2=sp.length();
		
		int total=len-len2;
		
		System.out.println("total count of g is : "+total);*/
		
		//17. occurance of string
		
	/*	String str="hellow world hellow world rough champ";
		
		 
		
		String [] str2=str.split(" ");
		
		Map<String , Integer> map=new HashMap<>();
		
		for(String a:str2) {
			
			if(map.containsKey(a)) {
				
				map.put(a, map.get(a)+1);
			}else {
				
				map.put(a, 1);
			}
		}
		
		
		
		System.out.println(map);
		*/
		
		
		
		
		//17. occurance of string  >hellow
		
		/*	String str="hellow world hellow world rough champ";
		
		    //hellow
			
			String [] spl=str.split(" ");
			
			int count=0;
			
			for(String g:spl) {
			
			if(g.equals("hellow")) {
				
				count++;
			}
		
		
			}	
			
			System.out.println(count);*/
		
		
		//18 find the longest string
	
		/*String name="programming dolphin java have a sweet";
		
		String [] str=name.split(" ");
		
		int len=0;
		
		String len1="";
		
		for(String a:str) {
			
			if(a.length()>len1.length()) {
				
				   len1=a;
			}
		}
		
	System.out.println(len1);
		System.out.println(len1.length());
		*/
		
		//19 find the middle character
		
		/*String name="vikash";
		
		char [] ch=name.toCharArray();
		
		int total_len=name.length();
		
		//int len1=ch.length;
		
		int mid=total_len/2;
		
		if(mid!=0) {
			
			System.out.println(ch[mid]);
		}else {
			
			System.out.println(ch[mid-1] +" "+ch[mid+1]);
		}
		
		*/
		
		//20 reverse two string
		
	/*	String str="name java complier save data play";
		
		String [] str_split=str.split(" ");
		
		String word1="java";
		
		String word2="save";
		
		String reverse_word="";
		
		for(String w:str_split) {
			
			String rev="";
			
			if(w.equals(word1)||(w.equals(word2))) {
				
				for(int i=0;i<w.length();i++) {
					
					rev=w.charAt(i)+rev;
				}
			}else {
				
				rev+=w;
			}
			
			reverse_word=reverse_word+rev+" ";
			
		}
	
	System.out.println(reverse_word);	
		*/
		
		//21 find the occurance of character
		
	/*	String name="aaabbbccccdddd";
		
		char [] ch=name.toCharArray();
		
		Map<Character ,Integer> map=new HashMap<>();
		
		for(char value:ch) {
			
			if(map.containsKey(value)) {
				
				map.put(value, map.get(value)+1);
					
				}else {
					
					map.put(value, 1);
			}
		}
		
		System.out.println(map);*/
		
		
	String str="Madam";
		
		String output="";
		
		for(int i=0;i<str.length();i++) {
			
		output=str.charAt(i)+output;
		}
		boolean b=str.equals(output);
		System.out.println(output);
		System.out.println("given string is palindrome :"+b);
		
		/*String str="stu123den578t9";
		
		String output="";
		char ch;
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			
			if(!Character.isDigit(ch))
				
				output=output+str.charAt(i);
		}
		
		System.out.println(output);*/
	}
}
