package String;

public class reverse_particular_string {

	public static void main(String[] args) {
		
		String str="tom and jerry are not good friend";
		
		String [] split=str.split(" ");
		
		String final_result="";
		
		String target_word="jerry";
		
		for(String p:split) {
			
			String rev="";
			
			if(p.equals(target_word)) {
				
				for(int i=target_word.length()-1;i>=0;i--) {
					
					rev=rev+p.charAt(i);
				}
			}else {
				
				rev=rev+p;
			}
			
			final_result=final_result+rev + " ";	
		}
		
		
	System.out.println(final_result);
		

	}

}
