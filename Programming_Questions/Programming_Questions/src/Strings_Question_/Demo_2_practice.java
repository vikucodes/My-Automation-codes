package Strings_Question_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo_2_practice {

	public static void main(String[] args) {

		/*
		 * String name="java and python are good language";
		 * 
		 * String [] spl=name.split(" ");
		 * 
		 * String target_1="good";
		 * 
		 * String reverse="";
		 * 
		 * for(String s:spl) {
		 * 
		 * String rev="";
		 * 
		 * if(s.equals(target_1)) {
		 * 
		 * for(int i=0;i<target_1.length();i++) {
		 * 
		 * rev=target_1.charAt(i)+rev; } }else {
		 * 
		 * rev=s+rev+" "; } reverse=reverse+rev+" ";
		 * 
		 * }
		 * 
		 * System.out.println("After reverse good from string is : "+reverse);
		 */

		/*
		 * String name="java and python are good language";
		 * 
		 * String [] spl=name.split(" ");
		 * 
		 * String target_1="good";
		 * 
		 * String target_2="java";
		 * 
		 * String reverse="";
		 * 
		 * for(String s:spl) {
		 * 
		 * String rev="";
		 * 
		 * if(s.equals(target_1)||s.equals(target_2)) {
		 * 
		 * for(int i=0;i<s.length();i++) {
		 * 
		 * rev=s.charAt(i)+rev ; }
		 * 
		 * }else {
		 * 
		 * rev=s+rev+ " "; }
		 * 
		 * reverse=reverse+rev+" "; }
		 * 
		 * System.out.println(reverse);
		 */

		/*
		 * String name="java and python are good language";
		 * 
		 * //reverse each word at its same position
		 * 
		 * String reverse="";
		 * 
		 * String [] spl=name.split(" ");
		 * 
		 * for(String s:spl) {
		 * 
		 * String rev="";
		 * 
		 * for(int i=0;i<s.length();i++) {
		 * 
		 * rev=s.charAt(i)+rev; }
		 * 
		 * reverse=reverse+rev+" "; } System.out.println(reverse);
		 */

		/*
		 * String name="vik134as san678ju";
		 * 
		 * String result="";
		 * 
		 * char ch;
		 * 
		 * for(int i=0;i<name.length();i++) {
		 * 
		 * ch=name.charAt(i);
		 * 
		 * if(!Character.isDigit(ch)) {
		 * 
		 * result=result+ch; } }
		 * 
		 * System.out.println(result);
		 */

		/*
		 * String name="madams";
		 * 
		 * String result="";
		 * 
		 * for(int i=name.length()-1;i>=0;i--) {
		 * 
		 * result=result+name.charAt(i); }
		 * 
		 * if(name.equals(result)) {
		 * 
		 * System.out.println("it is palindrome"); }else {
		 * 
		 * System.out.println("non palindrome"); }
		 * 
		 */

		/*
		 * String name="abcde"; String result="";
		 * 
		 * for(int i=0;i<name.length();i++) { result=name.charAt(i)+result; }
		 * 
		 * 
		 * boolean f= name.equals(result); System.out.println(f);
		 */

		// find the longest string

		/*
		 * String name="java and selenium are use for softwares testing"; String []
		 * spl=name.split(" "); String longest_length="";
		 * 
		 * for(String s:spl) {
		 * 
		 * if(s.length()>longest_length.length()) {
		 * 
		 * longest_length=s;
		 * 
		 * 
		 * 
		 * 
		 * }
		 * 
		 * }
		 * 
		 * System.out.println(longest_length);
		 * System.out.println(longest_length.length());
		 */

		/*
		 * System.out.println("Arrays programming question on 03 march 2025");
		 * 
		 * int n1=0 ,n2=1, sum=0;
		 * 
		 * System.out.println(n1+" "+n2);
		 * 
		 * for(int i=2;i<10;i++) {
		 * 
		 * sum=n1+n2; System.out.println(" "+sum); n1=n2; n2=sum; }
		 * 
		 * System.out.println(sum);
		 */

		// find the duplicate array

		/*
		 * int [] a= {10,15,0,12,10,16,152,36,15,12};
		 * 
		 * int dup=0;
		 * 
		 * for(int i=0;i<a.length;i++) {
		 * 
		 * for(int j=i+1;j<a.length;j++) {
		 * 
		 * if(a[i]==a[j]) {
		 * 
		 * dup=a[i]; a[i]=a[j];
		 * 
		 * 
		 * System.out.println(dup);
		 * 
		 * 
		 * }
		 * 
		 * 
		 * } }
		 */

		/*
		 * //length of last string
		 * 
		 * String name="java and selenium are use for automation testing"; String []
		 * str=name.split(" "); int len=str[str.length-1].length();
		 * System.out.println(str[str.length-1]); System.out.println(len);
		 */

		// count each character

		/*
		 * String name="vikas";
		 * 
		 * char [] ch= name.toCharArray();
		 * 
		 * Map<Character ,Integer>mp=new HashMap<>();
		 * 
		 * for(char ch1:ch) {
		 * 
		 * if(mp.containsKey(ch1)) {
		 * 
		 * mp.put(ch1 ,mp.get(ch1)+1); }else {
		 * 
		 * mp.put(ch1, 1); }
		 * 
		 * 
		 * 
		 * } System.out.println(mp);
		 */

		// Count no. of string
		/*
		 * String name="java java python C# number tablue C# C# count 1133 1212";
		 * 
		 * String [] str=name.split(" ");
		 * 
		 * Map<String ,Integer>map=new HashMap<>();
		 * 
		 * for(String s:str) {
		 * 
		 * if(map.containsKey(s)) {
		 * 
		 * map.put(s, map.get(s)+1); }else {
		 * 
		 * map.put(s, 1); } } System.out.println(map);
		 */
		// Arrays question

		/*
		 * int [] arr= {10,12,15,10,16,19,16,96,85,26,16,10,15}; //remove duplicates
		 * 
		 * Set<Integer>set=new HashSet<>();
		 * 
		 * for(int s:arr) {
		 * 
		 * set.add(s);
		 * 
		 * }
		 * 
		 * System.out.println(set);
		 */

		// find the 2nd highest no.

		/*
		 * int [] arr=
		 * {10,12,15,13,19,20,28,446,26,35,23,8,36,256,48,46,39,3,64,1,14,9,4,64,6,4};
		 * 
		 * int sec_highest=0; int highest=0;
		 * 
		 * for(int i=0;i<arr.length;i++) {
		 * 
		 * if(arr[i]>highest) { sec_highest=highest; highest=arr[i]; }else
		 * if(arr[i]>sec_highest ) {
		 * 
		 * sec_highest=arr[i]; } }
		 * 
		 * System.out.println("second hidhest value is :"+sec_highest);
		 */

		// find the 3rd highest no.
		/*
		 * int [] arr=
		 * {10,12,15,13,19,20,28,446,26,35,23,8,36,256,48,46,39,3,64,1,14,9,4,64,6,4};
		 * int third_highest=0; int sec_highest=0; int highest=0;
		 * 
		 * for(int i=0;i<arr.length;i++) {
		 * 
		 * if(arr[i]>highest) { third_highest=sec_highest; sec_highest=highest;
		 * highest=arr[i]; }else if(arr[i]>sec_highest ) { third_highest=sec_highest;
		 * sec_highest=arr[i];
		 * 
		 * }else if(arr[i]>third_highest) { third_highest=arr[i]; } }
		 * 
		 * System.out.println("second hidhest value is :"+sec_highest);
		 * System.out.println(third_highest);
		 */
		// fibaonci series

		/*
		 * int n1=0 ,n2=1, sum=0;
		 * 
		 * System.out.print(n1+" "+n2);
		 * 
		 * for(int i=2;i<10;i++) {
		 * 
		 * sum=n1+n2;
		 * 
		 * System.out.print(" "+sum);
		 * 
		 * n1=n2; n2=sum;
		 * 
		 * }
		 */

		// 11 march 2025

		// find the longest substring

		/*
		 * String name="java and copilot selenium using java";
		 * 
		 * String [] str=name.split(" ");
		 * 
		 * String word=""; int word_length=0;
		 * 
		 * for(String ch:str) {
		 * 
		 * if(ch.length()>word.length()) {
		 * 
		 * word=ch; }
		 * 
		 * 
		 * } System.out.println(word); System.out.println(word.length());
		 * 
		 */

		// find the missing no.

		/*
		 * int [] a= {1,2,4,5,6};
		 * 
		 * int missing_no=0; int sum=0;
		 * 
		 * for(int i=0;i<a.length;i++) {
		 * 
		 * sum+=a[i];
		 * 
		 * 
		 * }
		 * 
		 * System.out.println(sum);
		 * 
		 * int [] b=new int [6];
		 * 
		 * int sum1=0;
		 * 
		 * for(int j=1;j<b.length;j++) {
		 * 
		 * sum1+=j;
		 * 
		 * }
		 * 
		 * System.out.println(sum1);
		 * 
		 * System.out.println("missing no is : "+(sum-sum1));
		 */

		// check the given string is anagrams

		/*
		 * String name="Listen"; String name1="Silent";
		 * 
		 * name= name.toLowerCase(); name1= name1.toLowerCase();
		 * 
		 * 
		 * char [] ch=name.toCharArray(); char [] ch1=name1.toCharArray();
		 * 
		 * Arrays.sort(ch); Arrays.sort(ch1);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * if(Arrays.equals(ch, ch1)) {
		 * 
		 * System.out.println("given string is anagroms");
		 * 
		 * 
		 * }else {
		 * 
		 * System.out.println("given string is not anagroms"); }
		 */

		// check the given string is fibnonci series

		/*
		 * String name="madam"; char ch;
		 * 
		 * String result="";
		 * 
		 * for(int i=0;i<name.length();i++) {
		 * 
		 * ch=name.charAt(i);
		 * 
		 * result=name.charAt(i)+result; } if(name.equals(result)) {
		 * 
		 * System.out.println("given string is palindrome"); } else {
		 * System.out.println("non palindrome");
		 * 
		 * }
		 * 
		 * System.out.println(result);
		 * 
		 */

		// Count occurance of character
		/*
		 * String word="programming";
		 * 
		 * char ch='m';
		 * 
		 * int count=0;
		 * 
		 * 
		 * for(int i=0;i<word.length();i++) {
		 * 
		 * if(word.charAt(i)==ch) {
		 * 
		 * count++;
		 * 
		 * 
		 * }
		 * 
		 * } System.out.println(count);
		 */

		// find the occurance of each character

		/*
		 * String name="aaabbbccddefeeeellllll";
		 * 
		 * char [] ch=name.toCharArray();
		 * 
		 * 
		 * Map<Character ,Integer>map=new HashMap<Character ,Integer>();
		 * 
		 * for(char arr:ch) {
		 * 
		 * if(map.containsKey(arr)) { map.put(arr, map.get(arr)+1);
		 * 
		 * }else { map.put(arr, 1); } }
		 * 
		 * System.out.println(map);
		 */

		// Arrays programming question 11 march 2025

		// merge two array in sorted order

		/*
		 * int [] a= {10,2,6,59,3,6,48,9,63}; int [] b= {15,8,46,36,14,17,52,96,63,31};
		 * 
		 * 
		 * int [] c=new int[a.length+b.length];
		 * 
		 * for(int i=0 ,j=b.length-1;i<a.length ;i++ ,j--) {
		 * 
		 * c[i]=a[i]; c[i+a.length]=b[j];
		 * 
		 * }
		 * 
		 * 
		 * 
		 * Arrays.sort(c); System.out.println(Arrays.toString(c));
		 * 
		 * 
		 */

		// find the 2nd highest

		/*
		 * int [] arr= {15,6,1,60,5,44,46,4,6,64,949,4,4,6,46,4};
		 * 
		 * int max=0; int sec_max=0;
		 * 
		 * for(int i=0;i<arr.length;i++) {
		 * 
		 * if(arr[i]>max) {
		 * 
		 * sec_max=max; max=arr[i]; }else if(arr[i]>sec_max) {
		 * 
		 * sec_max=arr[i];
		 * 
		 * 
		 * } }
		 * 
		 * 
		 * System.out.println("second max value is :"+ sec_max);
		 * 
		 */

		// String question

		/*
		 * String name="java and compiler";
		 * 
		 * String n1=name.trim();
		 * 
		 * char[] ch=n1.toCharArray();
		 * 
		 * Map<Character ,Integer> mp=new HashMap<>();
		 * 
		 * for(char ch1:ch) {
		 * 
		 * if(mp.containsKey(ch1)) {
		 * 
		 * mp.put(ch1, mp.get(ch1)+1); }else {
		 * 
		 * mp.put(ch1, 1); }
		 * 
		 * } System.out.println(mp);
		 */

		// remove duplicate from array

		/*
		 * int [] arr= {10,15,16,13,4,6,9,10,18,16,86,16,9};
		 * 
		 * //List list= Arrays.asList(arr);
		 * 
		 * Arrays.sort(arr);
		 * 
		 * Set<Integer> set=new HashSet<>(); for(int ar:arr) {
		 * 
		 * set.add(ar); } System.out.println(set);
		 * 
		 * List<Integer> list=new ArrayList<>(set);
		 * 
		 * Collections.sort(list);
		 * 
		 * System.out.println(list);
		 * 
		 */
		/*
		 * int [] arr= {10,15,16,13,4,6,9,10,18,16,86,16,9};
		 * 
		 * HashSet<Integer> set=new HashSet<>(); HashSet<Integer> dup=new HashSet<>();
		 * 
		 * for(int num:arr) { if(set.contains(num)) {
		 * 
		 * dup.add(num); }else { set.add(num); }
		 * 
		 * }
		 * 
		 * //for(int value:dup) {
		 * 
		 * System.out.println(dup);
		 */
//remove the duplicate and find the common arrray
		/*int[] arr = { 10, 15, 16, 13, 4, 6, 9, 10, 18, 16, 86, 16, 9 };

		int[] arr1 = { 11, 5, 2, 6, 13, 21, 54, 44, 1, 00, 18, 15, 6, 78 };

		Set<Integer> set = new HashSet<Integer>();

		Set<Integer> set1 = new HashSet<Integer>();

		for (int ch : arr) {

			set.add(ch);
		}

		for (int ch1 : arr1) {

			set1.add(ch1);
		}
		//set.addAll(set1);
		
		set.retainAll(set1);

		System.out.println(set);
		
		*/
		
		//find the duplicate
		
		
	/*	int[] arr1 = { 11, 15, 2, 6, 13, 21, 54, 44, 1, 00, 18, 15, 6, 78 };
		
		
		Set<Integer> set=new HashSet<Integer>();
		
		Set<Integer> dup=new HashSet<Integer>();
		
		for(int value:arr1) {
			
			if(set.contains(value)) {
				
				dup.add(value);
			}else {
				
				set.add(value);
			}
			
			
		}
		
		
		System.out.println(dup);
		System.out.println(set);
		
		*/
		
		//24.03.2025
		// check the given string is palindrome or not
		
	/*	String name="imadami";
		
		String rev="";
		
		char ch;
		
		for(int i=name.length()-1;i>=0;i--) {
			
			rev=rev+name.charAt(i);
	       	}
		
			if(name.equals(rev)) {
				
				System.out.println("given string is palindrome");
			}else  {
				
				System.out.println("given string is non palindrome");
			}
			
			
		
		
		//System.out.println(rev);
		///*/
		
		 //fibnonci series
		
		/*int n1=0 ,n2=1;
		int sum=0;
		
		System.out.println(n1+" "+n2);
		for(int i=2;i<10;i++) {
			
			sum=n1+n2;
			
			n1=n2;
			n2=sum;
			System.out.print(" " +sum);
		}
		*/
		
		//move zero to the end
		
		/*int [] arr= {0,0,0,10,0,23,10,0,26,13,26,6,6,26,78,0};
		
		int non_zero=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]!=0) {
				
				arr[non_zero]=arr[i];
				non_zero++;
				
				
			}
			}
		
		for(int i=non_zero;i<arr.length;i++) {
			
			arr[i]=0;
		}
		for(int value:arr) {
			
		
		
		System.out.print(" "+value);
	}*/
		
		
	/*	String name="system january";
		
		char [] arr=name.toCharArray();
		
		HashMap<Character ,Integer>map=new HashMap<>();
		
		for(char ch:arr) {
			
			if(map.containsKey(ch)) {
				
				map.put(ch, map.get(ch)+1);
			}else {
				
				map.put(ch, 1);
			}
		}
		
		System.out.println(map);*/
		
		//25.03.2025
		//remove the duplicate
	/*	
		int [] arr= {1,5,2,1,3,6,10,26,5};
	    int dup=0;
	    
	    Set<Integer>set=new HashSet<Integer>();
	    
	    for(int arr1:arr) {
	    	set.add(arr1);
	    	
	    }
	
	
	    System.out.println(set);
		*/
		
		//remove the duplicate from multiple array
		
	/*	int [] arr= {1,5,2,1,3,6,10,26,5};
		int [] arr1= {1,4,2,1,2,6,11,20,5};
		
		
		Set<Integer>set=new HashSet<>();
		
		for(int res:arr) {
			
			set.add(res);
		}
		Set<Integer>set1=new HashSet<>();
		for(int res1:arr1) {
			set1.add(res1);
			
		}
		set.addAll(set1);
		

		System.out.println(set);
		*/
		
		//find the duplicate
		
		/*int [] arr={1,4,2,1,2,6,11,20,6};
		
		//int dup=0;
		
		HashSet<Integer>set=new HashSet<Integer>();
		
		HashSet<Integer>dup=new HashSet<Integer>();
		
		
		for(int value:arr) {
			
			if(set.contains(value)) {
				
				dup.add(value);
			}else {
				
				set.add(value);
			}
			
		
		}
			
		
		
	//	dup.addAll(set);
		
	//	dup.retainAll(set);
		System.out.println(dup);*/
		
		
	//reverse one word
		
		/*String name="java and python both different language";
		
		String word_rev="python";
		
		String final_rev="";
		
		
	String [] word=	name.split(" ");
	
	
	for(String rev:word) {
		
		String result="";
		
		if(rev.equals(word_rev)) {
			
			for(int i=0;i<rev.length();i++) {
				
				
				result=rev.charAt(i)+result;
				
			}
		}else {
			
			result+=rev+" ";
		}
		final_rev=final_rev+result+ " ";
		
	}
		
		System.out.println(final_rev);
		*/
		
		
		//shift all zeroes to the left
		
	/*	int [] a= {0,20,30,5,0,6,3,0,89,0,25,03,29,0,0,0,8,9,3,45,65};
		
		
		int non_zeroes=0;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]!=0) {
				a[non_zeroes]=a[i];
				non_zeroes++;
					

			}
		}
			for(int i=non_zeroes;i<a.length;i++) {
				
				a[i]=0;
				
				
			}
		
		
		for(int value:a) {
			
			System.out.print(" "+value);
		}
		*/
		//addition of even and odd
		
	/*	int [] arr= {10,11,12,13,14,15,16};
		
		int even=0;
		int odd=0;
		int count=0;
		int count_od=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2==0) {
				even=arr[i];
				count+=arr[i];
				System.out.println(even);
			}else if(arr[i]%2!=0) {
				
				//odd=arr[i];
				count_od+=arr[i];
				
			}
			
		
		}
		
		System.out.println("even coount is :"+count);
		System.out.println("odd count is :"+count_od);*/
		
		//find the common array
		
		/*int [] arr= {1,2,3,45,1,2,3,6,5,9,4,2,65,25,5,6,9,7};
		
		Arrays.asList(arr);
		
		Set<Integer> set=new HashSet<>();
		Set<Integer> dup=new HashSet<>();
		
		for(int a:arr) {
			if(!set.add(a)) {
				dup.add(a);
			}
		}
		System.out.println(set);
		System.out.println(dup);
		*/
		
		//find the second highest
		
		/*int [] arr= {1,2,3,4,8,10,9,7};
		
		int highest=0;
		int second_highest=0;
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>highest) {
				
				second_highest=highest;
				highest=arr[i];
				
				
			}else if(arr[i]>second_highest) {
				
				second_highest=arr[i];
			}
		}
		
		System.out.println(highest);
		System.out.println(second_highest);*/
		
		//find the missing no.
	/*	
		int [] arr= {1,2,4,5,6};
		
		
		int sum=0;
		int sum1=0;
		for(int i=0;i<=arr.length-1;i++) {
			
			sum+=arr[i];
		}
		
		for(int i=1;i<=6;i++) {
			
			sum1+=i;
		}
		
		System.out.println(sum1-sum);
		*/
		
		//check palindrome
		
		//int a=12321;  need to check 
		
		//merge two array in sort order
		
		/*int [] a= {1,2,3,4,5,6,2,5,1,2,3,6};
		int[] b= {10,2,5,6,64,4,123,3,6,64,64,874};
		
		int [] c=new int [a.length+b.length];
		
		
		for(int i=0 ,j=b.length-1;i<=a.length-1;i++,j--) {
			c[i]=a[i];
			c[i+a.length]=b[j];
			
			
		}
		Arrays.sort(c);
		
		System.out.println(Arrays.toString(c));
	*/
		
		//check the palindrome
		
		
	/*	String name="madam";
		String result="";
	
	for(int i=0;i<name.length();i++) {
		
		result=name.charAt(i)+result;
	}
	System.out.println(result);
	
	boolean res=result.equals(name);
	
	System.out.println(res);
	*/
		
		//occurance of character
		
	/*	String name="japan europe";
		
	char []	ch=name.toCharArray();
	
	
	Map<Character ,Integer>map=new HashMap<>();
	
	for(char res:ch) {
		
		if(map.containsKey(res)) {
			
			map.put(res, map.get(res)+1);
		}else {
			
			map.put(res, 1);
		}	
		
	}
	
	System.out.println(map);
	*/
		
		//check anagroms
		
		/*String a="listen";
		String b="silent";
		
		
		
		char [] ch=a.toCharArray();
		
		Arrays.sort(ch);
		char [] ch1=b.toCharArray();
		Arrays.sort(ch1);
		
		if(Arrays.equals(ch, ch1)) {
			System.out.println("given string is anagroms");
		}else {
			System.out.println("it is non anagroms");
		}*/
		
		//reverse a particular word
		
	/*	String name="john and chadwick are two friends";
		
		String [] word=name.split(" ");
		
		String rev_word="and";
		
		String result="";
		
		for(String rev:word) {
			
			String rev_res="";
			
			if(rev.equals(rev_word)) {
				
				for(int i=0;i<rev_word.length();i++) {
					
					rev_res=rev_word.charAt(i)+rev_res;
					
					
				}
			}else {

				rev_res=
						rev_res+rev;
			
			}
			
			result=result+rev_res+" ";
		}
		
		
		
		
		System.out.println(result);
		
		*/
		
		//08.05.2025
		
		//count the length of longest string
		
	/*	String name="java and python both are language also difficulties its logic is same only method is different";
		
		String[] name1=name.split(" ");
		
		String longest_word="";
		
		int longest_value=0;
		
		for(String str:name1) {
			
		if(str.length()>=longest_word.length()) {
			longest_value=str.length();
			longest_word=str;
		
		}
		}
		System.out.println(longest_value);
		System.out.println(longest_word);
			
		*/
		
		
		//move all zeroes to the right
		
	/*	int [] arr= {10,15,0,26,0,9,0,0,78,36,0,0,96,0,35,0,0,0,0,19,16,135,163};
		
		int non_zeroes=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]!=0) {
				
				arr[non_zeroes]=arr[i];
				non_zeroes++;	
			}
		}
		
		for(int i=non_zeroes;i<arr.length;i++) {
			
			arr[i]=0;
			
		}
		
		for(int a:arr) {
		
		System.out.print(" "+a);
		}
		*/
		
		//remove the duplicate character
		/*
		String name="programming";
		
		char[] ch=name.toCharArray();
		
		Set<Character> set=new HashSet<>();
		for(char c:ch) {
			set.add(c);
			
		}
		
		System.out.println(set);
		
		*/
		
		/*String name="programming";
		
        List<String>list=new ArrayList<>();
        
        list.add(name);
		Set<String> set=new HashSet<>(list);
		
		//set.addAll(list);
			
		
		
		System.out.println(set);
		*/
		
		//11.04.2025
		
		//find the largest integer
		
	/*	int [] arr= {1,2,4,3,89,450,12,86,72,6};
		
		int largest=0;
		
		for(int i=0;i<arr.length;i++) {
			
			
			if(arr[i]>largest) {
				
				largest=arr[i];
			}
		}
		System.out.println(largest);
		*/
		
		
		//find the even no
	/*	int [] arr= {1,2,4,3,89,450,12,86,72,6};
		
		int even=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				
				even=arr[i];
				System.out.println(even);
			}
			
		}
		*/
		// check the palindrome
		
		
	/*	String name="Madam";
		
	String name1=	name.toLowerCase();
		
		String result="";
		
		for(int i=0;i<name.length();i++) {
			
			result=name.charAt(i)+result;
				
		}
		
		boolean res=name.equals(result);
		
		System.out.println(res);
		*/
		
	/*	int n1=0,n2=1,sum=0;
		
		sum=n1+n2;
		System.out.println(n1+" "+n2);
	for(int i=2;i<10;i++) {
		
		
		n1=n2;
		n2=sum;
		sum=n1+n2;
		System.out.print(" "+sum);
	}
	*/
		//reverse each word without change its position
	/*	String name="java and python are two language";
		
		String [] w=name.split(" ");
		
		String rev="";
		
		for(String g:w) {
			
			String reverse="";
			
			for(int i=0;i<g.length();i++) {
				
				reverse=g.charAt(i)+reverse;
			}
			
			rev=rev+reverse+" ";
			rev.charAt(g.length()-1);
		}
		
		System.out.println(rev);
		*/

		//occurance of each character
		
	/*	String name="helloow";
		
		char []ch=name.toCharArray();
		
		Map<Character ,Integer> map=new HashMap<>();
		
		for(char value:ch) {
			
		
		
		if(map.containsKey(value)) {
			
			map.put(value, map.get(value)+1);
			
		}else {
			map.put(value, 1);
		}
		}
		System.out.println(map);
		*/
	/*	//move all zeroes to the right
		
		int [] arr= {10,0,2,6,2,0,0,6,85,6,9,266,0,6,9,0,46,0,92,0,0,0,0,0,333,256,5};
		
		int non_zero=0;
		
		
		for(int i=0;i<arr.length;i++) {
			
			
			if(arr[i]!=0) {
				arr[non_zero]=arr[i];
				non_zero++;
			}
		}
		for(int i=non_zero;i<arr.length;i++) {
			
			arr[i]=0;
		}
	
		for(int value:arr) {
			System.out.print(value+" ");
		}
		*/
		
		//find the 2nd highest
		
		/*int [] arr= {10,11,2,112,15,13,25,6};
		int max=0;
		int Sec_max=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				Sec_max=max;
				max=arr[i];
			}else if(arr[i]>Sec_max){
				Sec_max=arr[i];
				
			}
		}
			
		System.out.println("max integer is :"+max);
		System.out.println("Sec_max integer is :"+Sec_max);
		*/
		//reverse a particular string
		
		/*String name="hellow world welcome to world";
		
		String [] spl=name.split(" ");
		
		String rev_str="world";
		
		String word="";
		
		for(String rev:spl) {
			
			String rev_word="";
			
			if(rev.equals(rev_str)) {
				
				for(int i=0;i<rev_str.length();i++) {
					
					rev_word=rev_str.charAt(i)+rev_word;
				}
			}else {
				
				rev_word=rev+rev_word;
			}
			
			word=word+rev_word+" ";
		}
		System.out.println(word);*/
		// find the second highest no.
		
	/*	int [] a= {1,4,5,2,6,5,21,4,5,86,5,6,609,64,6};
		
		int max=0;
		int sec_max=0;
		
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max) {
				
				sec_max=max;
				max=a[i];
			}else if(a[i]>sec_max) {
				
				sec_max=a[i];
			}
			}
		System.out.println("second max value is :"+sec_max);
		*/
		
		// remove the duplicate value
		
	/*	int [] a= {10,12,45,13,10,15,16,10,216,12,16};
		
		HashSet<Integer> set=new HashSet<>();
		HashSet<Integer> dup=new HashSet<>();
		
		for(int arr:a) {
			if(set.contains(arr)) {
				
				dup.add(arr);
			}else {
				
				set.add(arr);
			}	
		}
		List<Integer> list=new ArrayList<>(set);
		
		Collections.sort(list);
		System.out.println(list);*/
		
		
		//fibnonci series
		
	/*	 int n1=0,n2=1 ,sum=0;
		System.out.println(n1+ " "+n2);
		
		for(int i=2;i<=10;i++) {
			
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.print(" "+sum);
			*/
		
		// check the anagrams
		
	/*	String a="Listen";
		String b="Silent";
		
	   String a1=a.toLowerCase();
	   String b1=b.toLowerCase();
	   
	char [] ch=   a1.toCharArray();
	char [] ch1=b1.toCharArray();
	
	Arrays.sort(ch);
	Arrays.sort(ch1);
	
	if(Arrays.equals(ch1, ch)) {
		
		System.out.println("it is anagroms");
	}else {
		System.out.println("it is non anagrams");
	}
		*/
		
		
		
		//reverse the array 
		
	/*	int [] arr= {10,15,16,19,12,16,16,13,15};
		
		for(int i=arr.length-3;i>=0;i--) {
			
			System.out.print(arr[i]+" ");
		}
		*/
		
		//check the fibnonci series
		
		
	/*	int n1=0,n2=1,sum=0;
		
		System.out.println(n1+ " "+n2+" ");
		
		for(int i=2;i<=10;i++) {
			
			
			sum=n1+n2;
			
			System.out.println(sum+" ");
			n1=n2;
			n2=sum;
		}
		*/
		
		//check the anagroms
		
	/*	String first_name="Listen";
		String second_name="Silent1";
		
	        String first_name1=	first_name.toLowerCase();
			String second_name1 =second_name.toLowerCase();
		
		char [] ch1=first_name1.toCharArray();
		char [] ch2=second_name1.toCharArray();
		
	       Arrays.sort(ch1);
	       Arrays.sort(ch2);
	   
	   
		if(Arrays.equals(ch1, ch2)) {
			
			System.out.println("given string is anagroms");
		}else {
			
			System.out.println("given string is not anagroms");
		}*/
		
	/*	String name="programming";
		
	char [] ch=	name.toCharArray();
	
	Set<Character> set=new HashSet<>();
	
	for(char ch1:ch) {
		
		set.add(ch1);
	
		System.out.println(set);
		}
		*/
		
		//remove special character
		
		/*String name="ja$%va H5as^&* it%^^&s ow*&n";
		
		
		String result="";
		
		String res=name.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(res+" ");
		*/
		
	//	find the 3rd highest no.
	/*	
		int [] arr= {300,15,12,40,52,26,19,13};
		
		
		int max=0;
		int sec_max=0;
		int third_max=0;
		
		for(int i=0;i<arr.length;i++) {
			
			
			if(arr[i]>max) {
				
				third_max=sec_max;
				sec_max=max;
				max=arr[i];
			}else if(arr[i]>sec_max) {
				third_max=sec_max;
			sec_max=arr[i];
		}else if(arr[i]>third_max) {
			
			third_max=arr[i];
			
		}
		
			
		
	}
		
		System.out.println(third_max);
		System.out.println(sec_max);
		System.out.println(max);
		*/
		
		//Count the frequency of each character/word

		/*String name="characteristics";
		
		char [] ch=name.toCharArray();
		
		Map<Character ,Integer> fre=new HashMap<Character,Integer>();
		
		for(char arr:ch) {
			
			if(fre.containsKey(arr)) {
				
				fre.put(arr, fre.get(arr)+1);
			}else {
				
				fre.put(arr, 1);
			}
		}
		
		System.out.println(fre);
		*/
		
		//find the duplicate value
     
	/*	String name="characteristics";
		
		char [] arr=name.toCharArray();
		
		
		Set<Character> set=new HashSet<>();
		Set<Character> dup=new HashSet<>();
		
		for(char ch:arr) {
		//	set.add(ch);
			
		if(!set.add(ch)) {
			dup.add(ch);
		}
		}
		System.out.println(set);
		System.out.println(dup);
		*/
		
		//reverse a string
		
	/*	String name="java and python are language";
		
		String [] split=name.split(" ");
		
		String target_word="java";
		String target_word1="python";
		
		
		String res="";
		
		char ch;
		for(String word:split) {
			
			String reverse="";
			
			if(word.equals(target_word)||word.equals(target_word1)) {
				
				for(int i=0;i<word.length();i++) {
					
					reverse=word.charAt(i)+reverse;
				}
			
			}else {
				
				reverse+=reverse+word;
			}
			res=res+reverse+" ";
		}
		System.out.println(res+" ");
		
		*/
		
		//replace a string
		
	/*	String name="java and python are language";
		
		
	String g=	name.replaceAll("java", "C#");
		
		System.out.println(g);
		*/
		
	/*	String name="java and python are language";
		
		String [] split=name.split(" ");
		
		String word="";
		
		int word_length=word.length();
		for(String str:split) {
			
		for(int i=0;i<str.length();i++) {
			
			if(str.length()>word_length) {
				
				word_length=str.length();
			}
			
		}
			
		}
		System.out.println(word_length+" "+word.indexOf(word_length));
		*/
		
		//Move all Zeroes to the right

	/*	int [] arr= {15,12,0,16,250,19,0,9,0,56,1,0,9,0,0,96,3,6,1,3,0,99};
		
		int non_zero=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]!=0) {
				
				arr[non_zero]=arr[i];
				non_zero++;
			}
			}
		for(int i=non_zero;i<arr.length;i++) {
			
			arr[i]=0;
		}
		
		for(int a:arr) {
			
			System.out.print(" "+a);
		}
		*/
		//Reverse each word without change its position
       /*  String name="java compiler hellow world";
         
         String result="";
         
         String [] arr=name.split(" ");
         
         for(String str:arr) {
        	 
        	 String reverse="";
        	 
        	 for(int i=0;i<str.length();i++) {
        		 
        		 reverse=str.charAt(i)+reverse;
        	 }
        	 
        	 result=result+reverse+" ";
         }
         
         
System.out.println(result);
*/
		
		//Find the even and odd
     
	/*	int [] arr= {1,2,3,5,4,6,7,8,9,10,11};
		
		int even=0;
		int odd=0;
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2!=0) {
				
			odd=arr[i];
			System.out.println(odd);
				
			}else if(arr[i]%2==0) {
				
			even=arr[i];
			System.out.println("even no." +even);
			}
		}
		*/
		// Find the sum of even and odd

	/*	int [] arr= {1,2,3,5,4,6,7,8,9,10,11};
		
		int even_sum=0;
		int odd_sum=0;
		int count=0;
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2!=0) {
				
				odd_sum+=arr[i];
				
			}else if(arr[i]%2==0) {
				
			
				even_sum+=arr[i];	
	}
}
	System.out.println(even_sum);	
	System.out.println(odd_sum);
	*/
		//Find the missing no.
		
	/*	int [] arr= {1,2,4,5};
		
		int sum=0;
		//int sum1=0;
		
		for(int i=0;i<arr.length-1;i++) {
			
			sum+=arr[i];
			
		//	System.out.println(sum);
		}
		
		int [] a=new int [5];
		int sum1=0;
       for(int j=1;j<a.length;j++) {
	
	   sum1+=j;
}
//System.out.println(sum1);
      System.out.println((sum1-sum));
      */
		//Remove duplicate from multiple array

	/*	int [] arr= {10,15,2,16,15,12,36,15,10,12,15,13,855};
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int dup:arr) {
			
			set.add(dup);
		}
		
		System.out.println(set);
		*/
		
		//Merge two array in sort order

	/*	
		int [] a={10,15,2,16,15,12,36,15,10,12,15,13,855};
		int [] b= {15,12,15,10,0,16,19,12,15,1316,15,3,9};
		
		int []c=new int[a.length+b.length];
		
		for(int i=0,j=b.length-1;i<a.length;i++,j--) {
			
			c[i]=a[i]; 
			c[i+a.length]=b[j];
		}
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int d:c) {
			
			System.out.print(" "+d);
		}
		*/
		//Find the lenth of String without lenth method
		
	/*	int [] 	arr= {10,12,15,13,16};
		
		
		int length_ofarray=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr.length>length_ofarray) {
				
				length_ofarray=arr.length;
			}
			
			
		}
		System.out.println(length_ofarray);
		*/
		
		//Find the lenth of last String
     
	/*	String name="java and hellow world";
		
	String [] split=	name.split(" ");
	
//	for(String str:split) {
		
	String length1=	split[split.length-1];
	
//int length_1=0
		

	System.out.println(length1.length());
	*/
		
		//find the max and min from list
		
	/*	List<Integer> list=new ArrayList<Integer>();
		
		list.add(5);
		list.add(10);
		list.add(19);
		list.add(2);
		list.add(16);
		list.add(152);
		list.add(-196);
		list.add(12);
		
	System.out.println(	Collections.min(list));
	System.out.println(Collections.max(list));
	
	
	*/
		
		//interchange the position of string
      
		
	/*	String str="java and copiler is totally different";
		
		str =	str.replace("java","Temp");
	str=	str.replace("is","java");
	str=str.replace("Temp","is");
		
		System.out.println(str);
		
		*/
		
	//	Reverse a string in Linked list
		
	/*	List<String> list=new ArrayList<String>();
		
		list.add("john");
		list.add("robin");
		list.add("smile");
		list.add("samuel");
		list.add("mark");
		
		System.out.println(list);
		
	String [] str=list.toArray(new String[0]);
	
	
	
	System.out.println(Arrays.toString(str));
	*/
		
		//Find the majority of element
   
		/*int [] arr= {10,10,20,60,16,0,16,19,10,10};
		
		
		Map<Integer ,Integer> map=new HashMap<>();
		
		for(int value:arr) {
			
			if(map.containsKey(value)) {
				
				map.put(value, map.get(value)+1);
			}else {
				
				map.put(value, 1);
			}
		}
		System.out.println(map);
		
		*/
		
		
		//solve the HashSet query
		
	/*	HashSet <Object> set=new HashSet<>();
		
		set.add(5);
		set.add("house");
		
	set.add("john");
	
	set.add(45);
	set.add("john");
	set.add("plan");
	
	set.remove(45);
	System.out.println(set);
	
		*/
	/*	//reverse each word of string and make first letter of reverse string to upper case
		String name="john hay morten michael vika";
		
	String [] split=	name.split(" ");
	
	String result="";
	
	for(String str:split) {
		
		String rev="";
		String g="";
		for(int i=0;i<=str.length()-1;i++) {
			
			rev=str.charAt(i)+rev;
			
		 g=	rev.substring(0 , 1).toUpperCase()+rev.substring(1);
		}
		
		result=result+g+" ";
	}
		System.out.println(result);
		
		*/
		//sum of digit
		
	/*	String d="123456789";
		
	char [] ch=	d.toCharArray();
	
	int sum=0;
	
	int res=0;
	
	for(int i=1;i<ch.length;i++) {
		
		sum+=Character.getNumericValue(ch[i]);
	}
	System.out.println(sum);
//	System.out.println(ch);
///

 */
		
	/*	List<Integer> list=new LinkedList<>();
		
		list.add(15);
		list.add(85);
		list.add(19);
		list.add(5);
		list.add(95);
		list.add(63);
		
		System.out.println(list.get(0));
		*/
		
		
		//occurance of each character
		
	/*	String name="characteristics";
		
		char [] arr=name.toCharArray();
		
		Map<Character ,Integer> map=new HashMap<>();
		
		for(char ch:arr) {
			
			
			if(map.containsKey(ch)) {
				
				map.put(ch, map.get(ch)+1);
			}else {
				
				map.put(ch, 1);
			}
		}
		
		
		
		System.out.println("Occuracnce of each character : "+map);
		
		*/
		
		//find the missing no.
		
		int [] arr= {1,2,4,5};
		
		int missing_no=0;
		
		int sum=0;
		int sum1=0;
		for(int i=0;i<arr.length;i++) {
			
			sum+=arr[i];
		}
		
		for(int j=0;j<=5;j++) {
			sum1+=j;
			
		}
		
		System.out.println("missing no. in the given array is: "+(sum1-sum));
		
		
		//check the fibnonci series
		
	/*int n1=0 ,n2=1,sum;
		

		
		System.out.println(n1 + " " +n2);
		for(int i=2 ;1<10;i++) {
			sum=n1+n2;
			System.out.println(" "+sum);
			n1=n2;
			n2=sum;*/
		}
	}
		/* int n1 = 0, n2 = 1, sum;
		 * 

	        System.out.print(n1 + " " + n2); // Print first two terms

	        for (int i = 2; i < 10; i++) {  // Start from 2 because first 2 terms are already printed
	            sum = n1 + n2;
	            System.out.print(" " + sum);
	            n1 = n2;
	            n2 = sum;
	        }
	    }*/
	
			

