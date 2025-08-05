package DailyUpdate;

public class day6 {

	public static void main(String[] args) {
	
		/*int[] a= {10,10,20,30,40,50,60,3};
		
		int t=10;
		
		for(int arr:a) {
			
			if(arr==t) {
				System.out.println("true");
			}else if(arr!=t) {
				System.out.println("false");
			}
		}
*/
		
		
		//fibaonci series
		
		int n1=0,n2=1,sum=0;
		
		
		System.out.print(n1 + " " +n2);
		
		for(int i=0;i<10;i++) {
			
			sum=n1+n2;
			
			n1=n2;
			
			n2=sum;
			
			System.out.print(" "+sum);
		}
	}

}
