package practice;

import java.util.HashMap;
import java.util.Map;

public class practice_occuranceOf_StringAnd_Character {

	public static void main(String[] args) {

		String name="programming";
		
		char [] ch=name.toCharArray();
		
		Map<Character ,Integer> map=new HashMap<>();
		
		for(char value:ch) {
			
			if(map.containsKey(value)) {
				
				map.put(value, map.get(value)+1);
			}else {
				
				map.put(value, 1);
			}
		}
		
		System.out.println(map);
		
	}

}
