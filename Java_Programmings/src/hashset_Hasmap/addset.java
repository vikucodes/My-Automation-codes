package hashset_Hasmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class addset {

	public static void main(String[] args) {
		
		Set <Integer> set=new HashSet<Integer>();
		
		set.add(45);
		set.add(55);
		set.add(45);
		set.add(56);
		set.add(45);
		set.add(44);
		set.add(15);
		//for(int i=0;i<set.size();i++) {
		
			ArrayList<Integer> list=new ArrayList<Integer>(set);
			list.add(45);
			list.add(55);
			list.add(45);
			list.add(56);
			list.add(45);
			list.add(44);
			list.add(15);
		Collections.sort(list);
		System.out.println(list);

	}
	}

