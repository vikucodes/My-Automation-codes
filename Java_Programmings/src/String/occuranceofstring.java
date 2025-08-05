package String;

public class occuranceofstring {

	public static void main(String[] args) {
		
		//Count word
		//First Approach
		
	/*	String name="john charles abraham";
		
		int totalcount=name.length();
		
		int totalcount_afterremove=name.replace("a","").length();
		
		System.out.println("Number of occurance of a is"+ " "+(totalcount-totalcount_afterremove));*/
		
		//Second Approach
		
		String word="Hellow java you are champion";
		
		int word_length=word.length();
		
		int res=0;
		
		String result="";
		
		char ch;
		
		for(int i=0;i<word.length();i++) {
			
			ch=word.charAt(i);
			
			if(ch=='a') {
				
				result+=result;
				
				 res=result.length()	;
				
			}else {
				
				result=result+ch;	
				
			}
			
		}
		
		System.out.println(word_length-res);
	}

}
