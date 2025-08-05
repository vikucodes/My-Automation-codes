package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class counteachword {

	public static void main(String[] args) {
	//Approach 1
	/*System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=1;
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')){
				count++;
			}
		}
		System.out.println("Number of words in String"+" "+count);*/
		//2nd approach
		/*System.out.println("Enter the string");
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		sc.close();
		
		String [] arr=str.split(" ");
		System.out.println("the number of words"+ " "+arr.length);*/
		//2nd approach
		//String name="selenium with java is demanding ";
		
		//String [] arr=name.split(" ");
		
		//System.out.println(arr.length);
		
		
		//count the character
		
		String name="programming";
		
		char [] arr=name.toCharArray();
		
		Map<Character ,Integer> map=new HashMap<Character ,Integer>();
		
		for(char ch:arr) {
			
		if(map.containsKey(ch)) {
			
			map.put(ch, map.get(ch)+1);
		}else {
			
			map.put(ch, 1);
		}
		
		}
		System.out.println(map);
		}

}
