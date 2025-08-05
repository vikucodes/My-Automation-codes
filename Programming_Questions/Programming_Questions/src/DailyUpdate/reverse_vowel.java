package DailyUpdate;

public class reverse_vowel {

	public static void main(String[] args) {
		
		String word="rome to integer by usinge java";
		
		String [] arr=word.split(" ");

		//reverse only vowel
		
		String[] splitted=word.split(" ");
		char[] vowels = {'a','i','e','o','u'};
		
		String reverse="";
		
		for(String p:splitted) {
			
			String res="";
			
			for(int i=0;i<p.length();i++) {
				if(p.charAt(i)==vowels) {
					
				}

				
				res=res+p.charAt(i);
			}
			reverse=reverse+res + " ";
			
		}
		
		System.out.println(reverse);
		
		
		
	}




	

}
