package DailyUpdate;

public class day3 {

	public static void main(String[] args) {
		
		//length of last word
		
		String word="rome to integer by usinge java";
		
		String [] arr=word.split(" ");
		
		//System.out.println(arr[5].length());
		
		//reverse only vowel
		
		String[] splitted=word.split(" ");
		
		String reverse="";
		
		for(String p:splitted) {
			
			String res="";
			
			for(int i=p.length()-1;i>=0;i--) {
				
				res=res+p.charAt(i);
			}
			reverse=reverse+res + " ";
		}
		
		System.out.println(reverse);
		
		
		
	}

}
