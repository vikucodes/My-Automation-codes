package ArrayList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class find_max {

	public static void main(String[] args) {
	 Integer [] arr= {10,15,12,3,2,5,116,13,1315,64};
	 
	

	
		 
	   List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		 
	int max_no=( Collections.max(list));

	 
	System.out.println(max_no);
	}

}