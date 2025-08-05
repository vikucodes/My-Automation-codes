package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class remove_element {

	public static void main(String[] args) {
		
		int [] a=new int [5];
		a[0]=10;
		a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;
        
      // Arrays.asList(a);
       List <Integer> list=new ArrayList<Integer>();
      
       for(int a1:a) {
    	   list.add(a1);
       }
       
     list.remove(1);
     list.add(0, 51);
       System.out.println(list);
       
      
        
	}
	}

