package arrays;

public class findmaxandminno {

	public static void main(String[] args) {
		
		int [] number= {10,20,30,40,50,60,70,80,90,100};
		
		int maxno=number[0];
		int minno=number[0];
		
		for(int i=0;i<number.length;i++) {
			if(maxno<number[i]) {
				maxno=number[i];
				
			}else if(minno>number[i]) 
				minno=number[i];
			}
			System.out.println(maxno+ " " + minno);
			
		}

	}


