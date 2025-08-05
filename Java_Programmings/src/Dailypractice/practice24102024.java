package Dailypractice;

public class practice24102024 {

	public static void main(String[] args) {
		int [] a=new int [6];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=6;
		
		int [] b=new int [6];
		b[0]=a[5];
		b[1]=a[4];
		b[2]=a[3];
		b[3]=a[2];
		b[4]=a[1];
		b[5]=a[0];
		
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i;j<=a.length-1;j++) {
				if(a[i]==b[j]) {
				b[j]=a[i];
				
				}
				System.out.println(b[j]);	
			}
			
		}
	}

}
