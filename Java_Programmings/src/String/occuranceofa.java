package String;

public class occuranceofa {

	public static void main(String[] args) {
		
       String word="Hellow java you are champion";
		
		int word_length=word.length();
		
		System.out.println(word_length);
		int res=0;
		
		String result="";
		
		char ch;
		
		for(int i=0;i<word.length();i++) {
			
			ch=word.charAt(i);
			
			if(ch=='a') {
				
				result=result ;
		
			}else {
				
				result=result+ch;	
				
			}
			
		}
		
		System.out.println(word_length-result.length());
		System.out.println(result);
	}

}
