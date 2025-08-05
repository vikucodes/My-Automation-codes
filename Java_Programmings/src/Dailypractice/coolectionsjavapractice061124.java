package Dailypractice;

import java.util.ArrayList;
import java.util.Iterator;

public class coolectionsjavapractice061124 {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);
		list.add(35);
		list.add(80);
		
		//for(int i=0;i<list.size();i++) {
			
		
		//System.out.println(list.get(i));
	//	for(Object arr:list) {
	//		System.out.println(arr);
	//	}
		
		Iterator it=list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
