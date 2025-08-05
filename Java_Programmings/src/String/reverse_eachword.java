package String;

public class reverse_eachword {

	public static void main(String[] args) {
		// reverse each word at same place
		
		String word="Hellow world";
	                 
			
		//method 1
		/*String [] rev=word.split(" ");
		String reverseword="";
		
		for(String w:rev) {
		StringBuilder sb=new StringBuilder(w);
		sb.reverse();
		
		reverseword=reverseword+sb.toString()+ " ";
		
		System.out.println(reverseword);*/
		
		
		//method 2
		
		String [] split=word.split(" ");
		
		String rev="";
		
		for(String w:split) {
			
			String reverse="";
			for(int i=w.length()-1;i>=0;i--) {
				reverse=reverse+w.charAt(i);
				
			}
			rev=rev+reverse+ " ";
		}
System.out.print(rev);
	}
	}

