package arrays;

import java.util.Arrays;

public class Addition_even_and_oddArray {

	public static void main(String[] args) {
		//Addition of even and odd array
		
		int [] value= {1,6,2,3,8,5,7,9,10,11};
		
		int even=0;
		int odd=0;
		
		for(int i=0;i<value.length;i++) {
			
			if( value[i]%2!=0) {
				//odd++;
				System.out.println(value[i]);
				odd=value[i]+odd;
				
			}else {
				//even++;
				System.out.println(value[i]);
				even=value[i]+even;
				
			}
				
		}

		System.out.println("Adddition of even array:" + even);
		System.out.println("Addition of odd array:"+ odd);
	}

}
