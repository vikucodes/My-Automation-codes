package arrays;

public class practice09122024 {

	public static void main(String[] args) {
		
		String word="rome was build";
		
		String [] splitted=word.split(" ");
		
		String reverse="";
		
		String targetted_word="was";
		
		char ch;
		
		for(int i=0;i<splitted.length;i++) {
			if(!splitted[i].equals(targetted_word)) {
				reverse=reverse+ " "+splitted[i];
			}else {
				for(int j=0;j<splitted[i].length();j++) {
					reverse=reverse+targetted_word
					
				}
				
			}
		}
	}
	}

		

