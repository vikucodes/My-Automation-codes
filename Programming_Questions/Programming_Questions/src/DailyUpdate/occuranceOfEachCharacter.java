package DailyUpdate;

import java.util.HashMap;
import java.util.Map;

public class occuranceOfEachCharacter {

	public static void main(String[] args) {
		
		String name="programming";
		
		Map<Character,Integer> mp=new HashMap<>();
		
		for(Character c:name.toCharArray()) {
			
			if(mp.containsKey(c)) {
				
				mp.put(c, mp.get(c)+1);
			}else {
				mp.put(c, 1);
				
			}
		}
		
		System.out.println(mp);
		
		String str="name name vikas kumar kumar kumar vikas  raj raj raj sinha";
		
		String [] splt=str.split(" ");
		
		
		Map<String ,Integer> map=new HashMap<>();
		
		for(String s:splt) {
			
			if(map.containsKey(s)) {
				
				map.put(s, map.get(s)+1);
			}else {
				map.put(s,1);
			}
		}
		
		System.out.println(map);
		
	}

}
