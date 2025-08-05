package ArrayList;

import java.util.ArrayList;

public class arraylistoarray {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(52);
		list.add("vikas");
		list.add('A');
		list.add(45);
		
		//list.toArray();
	
		//System.out.println(list.get(0));
		list.set(0, "charles");
		//list.set(0, 10);
		list.remove(2);
		list.add(1, "kumar");
		System.out.println(list);
	}

}
