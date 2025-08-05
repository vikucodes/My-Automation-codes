package arrays;

import java.util.Arrays;

public class sort_Array_Without_sorting_method {

	public static void main(String[] args) {
		
		int [] a= {90,70,80,10,60,50,6,25};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
