package arrays;

import java.util.Arrays;

public class commonarray {

	public static void main(String[] args) {
		int []a= {10,20,30,40,50,60};
		int []b= {11,10,20,50,60};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a [i]==b[j]) {
					a[i]=b[j];
					System.out.println(a[i]+" "+i);
					
					//break;
				}
			}
		}
	}

}
