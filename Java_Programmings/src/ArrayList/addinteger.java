package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class addinteger {

	public static void main(String[] args) {
		
		ArrayList <Integer>a=new ArrayList<Integer>();
		
		a.add(40);
		a.add(20);
		a.add(30);
		a.add(50);
		a.add(60);
		a.add(65);
		
	Collections.sort(a);
		
		System.out.println(Collections.min(a));
		System.out.println(Collections.max(a));
	
		
		
		
		
	}

}
