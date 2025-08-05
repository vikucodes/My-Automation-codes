package DailyUpdate;

import java.util.Arrays;

public class Day13 {

	public static void main(String[] args) {
		
		int [] a= new int [5];   //{10,5,6,9,48};
		
		a[0]=10;
		a[1]=5;
		a[2]=6;
		a[3]=9;
		a[4]=48;
		
		
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length;i++) {
			System.out.print( " "+ a[i]);
		}
	}
}