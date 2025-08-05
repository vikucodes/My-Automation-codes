package Dailypractice;

import java.util.HashSet;
import java.util.Set;

public class practice27082024 {

	public static void main(String[] args) {
		String name="rocky";
		
		char [] a=name.toCharArray();
		char ch;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					ch=a[i];
					a[i]=a[j];
					a[j]=ch;
					
				}
			}
			
		}
		System.out.println(new String(a));
		
		String s="how are you dear king maker";
		
		String [] arr=s.split(" ");
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
			
			
			
		}
		
		String data="god help themselves who help himself";
		
	String vowel="";
		int count =0;
		
		char ch1;
		
		for(int l=0;l<data.length();l++) {
			
			ch1=data.charAt(l);
			
			if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='0'||ch1=='u') {
				count++;
				System.out.println(data.lastIndexOf(ch1, l));
			}
			
		}
		System.out.println(count);
	}


			
		
	}

