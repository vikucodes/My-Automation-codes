package Dailypractice;

public class practice26122024 {

	public static void main(String[] args) {
		
		String str="tom and jerry are not a good friend";
		
		//reverse only jerry
		
		String [] split=str.split(" ");
		
		String target_word="jerry";
		
		String final_result="";
		
		
		for(String p:split) {
			
			String res="";
			
			if(p.equals(target_word)){
				
				for(int i=target_word.length()-1;i>=0;i--) {
					
					res=res+target_word.charAt(i);//yrrej
				}
				
			}else {
				
				res+=p;//res=res+p;
			}
			final_result=final_result+res+" ";
		}
		
		System.out.println(final_result);
	}

}
