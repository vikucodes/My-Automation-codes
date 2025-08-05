package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class thirdhighest {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(10);
		list.add(45);
		list.add(85);
		list.add(14);
		list.add(19);
		list.add(895);
		list.add(84);
		
		int thirdno=0;
		int highest=0;
		
		Collections.sort(list);
		
		System.out.println(list);
		
		if(list.size()>=3) {
			 thirdno=list.get(2);
		}
		
		System.out.println(thirdno);
	}

}
