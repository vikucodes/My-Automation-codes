package String;

public class remove_duplicate_character {

	public static void main(String[] args) {
		
		String word="programming";
		
		char ch;
		
		String final_word="";
		
		for(int i=0;i<word.length();i++) {
			
			ch=word.charAt(i);
			
			if(final_word.indexOf(ch)==-1) {
			
				final_word+=ch;
				
			}
		}
		
		System.out.println(final_word);

	}

}
