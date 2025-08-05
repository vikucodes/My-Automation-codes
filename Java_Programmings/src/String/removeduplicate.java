package String;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeduplicate {

	public static void main(String[] args) {
		String word="programming";
		
		char [] a=word.toCharArray();
		Set<Character>duplicates=new HashSet<Character>();
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
			duplicates.add(a[i]);
			}
		}
		
	}
		System.out.println(duplicates);
}
}	