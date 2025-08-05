package DailyUpdate;

import java.util.HashSet;
import java.util.Set;

public class Day_13_20012024 {

	public static void main(String[] args) {
		
		/*String name="programming";
		
		char [] spl=name.toCharArray();
		
		Set <Character> set=new HashSet<Character>();
		Set<Character> set1=new HashSet<Character>();
		for(int i=0;i<spl.length;i++) {
		
			for(int j=i+1;j<spl.length;j++) {
				
				if(spl[i]==spl[j]) {
					
					set.add(spl[i]);
				}else if(spl[i]!=spl[j]) {
					
					set1.add(spl[i]);
				}
				
			//	System.out.println(spl[j]);
			}
			
		}
		
		
		System.out.println(set);
		System.out.println(set1);*/
		
		
		String value="ram and shyam ram and shyam also his brother of friend";
		
		String [] str=value.split(" ");
		
		
		Set<String> set2=new HashSet<String>();
		Set<String> set3=new HashSet<String>();
		
		for(int i=0;i<str.length;i++) {
			
			for(int j=i+1;j<str.length;j++) {
				
				if(str[i]==str[j]) {
					
					set2.contains(i);
					
				}else if(str[i]!=str[j]) {
					
					set3.add(str[j]);
					
				}
			}
		}
System.out.println(set2);
System.out.println(set3);
	
	}
}
