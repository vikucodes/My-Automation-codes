package arrays;

public class missingnumber {

	public static void main(String[] args) {
		int a []= {1,2,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
System.out.println("sum of array:"+" "+sum);
	
int sum1=0;
for(int i=0;i<=5;i++) {
	sum1=sum1+i;    
}
System.out.println("number in the range:"+ " " +sum1);
System.out.println("Missing number:"+ " "+ (sum1-sum));
}
}