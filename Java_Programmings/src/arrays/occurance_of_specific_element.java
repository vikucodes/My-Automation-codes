package arrays;

public class occurance_of_specific_element {

	public static void main(String[] args) {
		
		int [] arr= {15,15,22,22,15,60,55,80};
		
		int target=15;
		
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==target) {
				count++;
			}
		}
		
System.out.println("occurance of character :"+ " "+target+ " "+count+"times");
	}

}
