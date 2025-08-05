package DailyUpdate;

public class Arrays_29012025 {

	public static void main(String[] args) {
		
		// 1 find the 2nd lowest no.
		
	/*	int [] arr= {1,2,3,4,5,6,7,8,9,1,11,15,21,13};
		
		
		int sec_lowest=Integer.MAX_VALUE;
		int lowest =Integer.MAX_VALUE;
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<lowest) {
				
				sec_lowest=lowest;
				lowest=arr[i];
			}else if(arr[i]<sec_lowest && arr[i]>lowest) {
				//lowest=sec_lowest;
				sec_lowest=arr[i];
			}
		}
System.out.println(sec_lowest);
System.out.println(lowest);*/
		
		// 2 find the 2nd highest no.
		
	/*	int [] arr= {10,11,05,2,6,35,69,4,5,96,64,78};
		
		
		int highest=arr[0];
		int sec_highest=arr[0];
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>highest) {
				
				sec_highest=highest;
				
				highest=arr[i];
			}else if(arr[i]>sec_highest) {
				
				sec_highest=arr[i];
			}
			
		}
			
		System.out.println(sec_highest);	*/
		
		
		// 3 find the length without length method
		
		
	/*	int [] arr= {10,11,05,2,6,35,69,4,5,96,64,78};
		
		int length=0;
		
		for(int a:arr) {
			
			if(a==length);
			
			length++;
		}
		System.out.println(length);
		*/
		
		//4 find the max and min
		
		/*int [] arr= {10,11,2,6,35,69,4,5,96,64,78};
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0 ;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}else if(arr[i]<min) {
				
				min=arr[i];
			}
		}
		
		System.out.println("max value is :" + max);
		System.out.println("min value is :"+ min);*/
		
		// 5 find the 3rd highest no.
		
	/*	int [] arr= {10,11,05,2,6,35,69,4,5,96,64,78};
		
		int max=arr[0];
		int sec_highest=arr[0];
		int third_highest=arr[0];
		
		for(int i =0 ;i<arr.length ;i++) {
			
			if(arr[i]>max) {
				
			sec_highest=third_highest;
			third_highest=max;
			max=arr[i];
			
			}else if(arr[i]>sec_highest) {
				third_highest=sec_highest;
				sec_highest=arr[i];
			}else if(arr[i]>third_highest) {
				
				arr[i]=third_highest;
			}
		}
		
		System.out.println("third highest : "+third_highest);
		System.out.println("sec_highest : " + sec_highest);
		System.out.println("highest :" + +max);*/
		
		//6 find even and odd
		
		/*int [] arr= {10,11,05,2,6,35,69,4,5,96,64,78};
		
		int even=0;
		int odd=0;
		
		for(int i =0 ;i<arr.length ;i++) {
			
			if(arr[i]%2==0) {
				even++;
				
			System.out.println("even no : "+arr[i]+" "+i);
			}else {
				odd++;
				System.out.println("odd no " + arr[i]);
			}
			
		}
		
		System.out.println(even);
		System.out.println(odd);*/
		
		// 7 find the prime no.
		
		String str="java dev";
		
		String inp="";
		
		String [] split=str.split(" ");
		
		for(int i=0;i<split.length;i++) {
			inp=split.toString();
			
		}
			
		System.out.println(inp);
	
	}

	
}
