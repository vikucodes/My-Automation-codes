package ArrayList;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class allvalue_first_question {

	public static void main(String[] args) {
		
		ArrayList mylist=new ArrayList();
		
		mylist.add(10);
		mylist.add(20);
		mylist.add(10);
		mylist.add(16.5);
		mylist.add("john");
		mylist.add('A');
		mylist.add(90);
		
		//Approach 1
		
		//for(int i=0;i<mylist.size();i++) {
			
			//System.out.println(mylist.get(i));
		
		
		//Approach 2
		
		java.util.Iterator it= mylist.iterator();	
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
