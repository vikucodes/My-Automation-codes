package Dailypractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class practice021124 {

	public static void main(String[] args) {
		
	//	String name="John and chadwick are not brothers";
		
	/*	String [] a=name.split(" ");
		for (String a1 : a) {
            System.out.println(a1);
		//System.out.println(a);*/
		
		
//		
//		String [] word=name.split(" ");
//		
//		String rev=""; 
//		
//		for(String W:word) {
//			String Reverse="";
//			
//			for(int i=W.length()-1;i>=0;i--) {
//				
//				Reverse=Reverse+W.charAt(i);
//				
//			}
//			rev=rev + Reverse+ " ";  // 1 2 3  >
//		}
//		System.out.println(rev);
		
		
		//Occurance of charater a
		//String name="John and chadwick are not brothers";
		
		
//		int original_length=name.length();
//		System.out.println(original_length);
//		
//		String  After_remove_a=name.replaceAll("a", "");
//		
//		int lenght_without_a=After_remove_a.length();
//		
//		System.out.println("no. of a:" + (original_length-lenght_without_a));
//		
		
		List <Integer> list=new ArrayList<Integer>();
		
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(65);
		list.add(25);
		list.add(30);
		list.add(12);
		list.add(17);
		list.add(29);
		list.add(9);
		list.add(7);
		
		//result=min value from list
		
	
		System.out.println("Min value:" + Collections.min(list));
		
		System.out.println("max value:"+ Collections.max(list));
		
		for(int i=0;i<list.size();i++) {
		
		
		Collections.sort(list);
		
		
		}
		System.out.println("Sort of list:" + list);
	}
}

