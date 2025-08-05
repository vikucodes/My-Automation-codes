package String;

import java.util.HashMap;

public class occuranceOfWord {

	public static void main(String[] args) {
	/*	String name="john and charles are good friend";
		
		String[] split=name.split(" ");
		
		String target_word="good";
		
		int count=0;
		
		
		for(String word:split) {
			
			if(word.equals(target_word)) {
				
				count++;
			}
			
		}
System.out.println(count);*/
		
		String name="john johny python java comiler python";
		
		String [] str=name.split(" ");
		
		HashMap<String ,Integer> map=new HashMap<String ,Integer>();
		
		for(String s:str) {
			
			if(map.containsKey(s)) {
				
				map.put(s, map.get(s)+1);
			}else {
				map.put(s, 1);
			}
		}
		
		System.out.println(map);

	}

}
