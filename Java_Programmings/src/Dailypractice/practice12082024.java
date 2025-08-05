package Dailypractice;

import java.util.Arrays;

public class practice12082024 {

	public static void main(String[] args) {
		int [] a= {10,20,30};
		int []b= {5,15,25};
		int sum=0;
		int sum1=0;
		
		for(int i=0;i<a.length;i++) {
			sum+=a[i];}
			for(int j=0;j<b.length;j++) {
			
			sum1+=b[j];
			
			
	}
			System.out.println(sum+sum1);
			int []c= {10,20,30};
			//find the number
			System.out.println(c[0]);
			int min=c[0];
			int max=c[0];
			for(int t=0;t<c.length;t++) {
				if(max<c[t]) {
					
					max=c[t];
					
				}else if(min>c[t]){
					
					min=c[t];
					
				}
			}
			System.out.println(max+ " "+min);
			
			//find the third highest
			int d[]= {15,16,12,150,160,950};
			int thirdhighest=d[0];
			Arrays.sort(d);
			for(int k=0;k<d.length-2;k++) {
				if(thirdhighest<d[k]) {
					thirdhighest=d[k];
				}
			
			}
			System.out.println(thirdhighest);
			
	}	
	
	
	
	
}
