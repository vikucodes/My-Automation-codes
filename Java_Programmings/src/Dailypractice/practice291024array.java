package Dailypractice;

import java.util.Arrays;

public class practice291024array {

	public static void main(String[] args) {
		
		
		int [] a=new int[4];
		a[0]=5;
		a[1]=10;
		a[2]=15;
		a[3]=20;
		
	System.out.println(Arrays.toString(a));
	
	int [] b=new int[4];
	for(int i=0;i<=a.length;i++) {
		for(int j=a.length-1;j>=0;j--) {
		if(a[i]==b[j]) {
			a[i]=b[j];
		}
		System.out.println(Arrays.toString(b));
	}
	
	}
	}

}