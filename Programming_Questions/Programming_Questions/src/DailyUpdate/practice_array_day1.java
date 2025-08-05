package DailyUpdate;

public class practice_array_day1 {

	public static void main(String[] args) {

		//1 find the second largest no.
		
		int [] a= {11,23,25,89,52,63,15,28,96,5,45};
		
		int Second_largest=0;
		int largest =0;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>largest) {
				
				Second_largest=largest;
				largest=a[i];
			}else if(a[i]>Second_largest) {
				
				Second_largest=a[i];
					
		
			}
			
			
		}
		System.out.println(Second_largest);
		System.out.println(largest);
		
		//2 find the missing no.*/
		
		
	  
	}

}
