package Dailypractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practice06122024 {

	public static void main(String[] args) {
		
		int [] arr=new int[5];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		//Arrays.asList(arr);
		List list=new ArrayList();
		
		for(int i:arr) {
		list.add(i);
		}
		
		
		list.remove(2);
		
	System.out.println(list);
		
		
		
		
	}

}
