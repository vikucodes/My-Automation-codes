package DailyUpdate;

public class Day_5 {

	public static void main(String[] args) {
		//12.12.2024 Arrays practice
		
		// 1.find the third highest integer from give array
		
		int [] digit=new int[7];//{10,20,30,40};
		
		digit[0]=15;
		
		digit[1]=20;
		
		digit [2]=25;
		
		digit [3]=35;
		
		digit[4]=50;
		
		digit[5]=10;
		
		digit[6]=23;
		
		int max=0;
		int sec_max=0;
		int third_max=0;
		
		for(int i=0;i<digit.length;i++) {
			
			if(digit[i]>max) {
				third_max=sec_max;
				sec_max=max;
				max=digit[i];
			}else if(digit[i]>sec_max){
				third_max=sec_max;
				sec_max=digit[i];
				
			}else if(digit[i]>third_max) {
				//sec_max=third_max;
				third_max=digit[i];
			}
		}
           System.out.println(max);
           System.out.println(sec_max);
           System.out.println(third_max);
	}

}
