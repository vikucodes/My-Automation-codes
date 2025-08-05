package arrays;

import java.util.Arrays;

public class copy_oneArray_into_newArray_inReverse {

	public static void main(String[] args) {
		
		int [] actual_array=new int[5];
		
		actual_array[0]=10;
		actual_array[1]=20;
		actual_array[2]=30;
		actual_array[3]=40;
		actual_array[4]=50;
		
		
		 int [] reverse_array=new int[actual_array.length];
		 
		 for(int i=0 ,j=actual_array.length-1; i<actual_array.length; i++,j--) {
			 reverse_array[j]= actual_array[i];
		 }
		 System.out.println(Arrays.toString(reverse_array));
	}

}
