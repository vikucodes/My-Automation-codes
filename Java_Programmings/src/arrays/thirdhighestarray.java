package arrays;

import java.util.Arrays;

public class thirdhighestarray {

	public static void main(String[] args) {
	 
		 int []a= {10,20,60,65,62,953,555,552};
		 
//		 Arrays.sort(a);
//		 int thirdno=a[0];
//		 for(int i=0;i<a.length-2;i++) {
//			 if(thirdno<a[i]) {
//				 thirdno=a[i];
//			 }
//			 
//		 }
//		 System.out.println(thirdno);
		 
		 int max=0;
		 int second_max=0;
		 int third_max=0;
		 
		 for(int a1:a) {
			 if(max<a1) {
				 third_max=second_max;
				 second_max=max;
				 max=a1;
			 }else if(second_max<a1) {
				 third_max=second_max;
				 second_max=a1;
				 
			 }else if(third_max<a1) {
				 third_max=a1;
				 
			 }
		 }System.out.println(third_max);
		
		 System.out.println(second_max);
		 
		 
		 System.out.println(max);
	}

}
