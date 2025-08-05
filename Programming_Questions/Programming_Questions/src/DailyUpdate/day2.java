package DailyUpdate;

import java.util.Arrays;

public class day2 {

	public static void main(String[] args) {
		
		int [] a=new int[4];
		
		a[0]=5;
		a[1]=10;
		a[2]=15;
		a[3]=20;
		
		int [] b=new int[4];
		
		
		for(int i=0 , j=a.length-1;j>=0;i++,j--) {
	//	for(int i=0;i<a.length;i++) {
		 
		
				
				b[i]=a[i];
					
		}
		System.out.println(Arrays.toString(b));
		
		}
	}


		
	


