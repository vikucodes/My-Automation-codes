package hashset_Hasmap;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		
		HashMap<Integer ,String> map=new HashMap<Integer ,String>();
		map.put(101, "Karan");
		map.put(102, "Arjun");
		map.put(103, "simran");
		
		map.remove(101);
		System.out.println(map);
	}

}
