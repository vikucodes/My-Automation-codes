package Dailypractice;

public class practice02032025 {

	public static void main(String[] args) {
		
		String name="java and python are two different language";
		
		String target_word="python";
		
		String [] str=name.split(" ");
		
		String final_result="";
		
		for(String s:str) {
			
			String rev="";
			
			if(s.equals(target_word)) {
				
				for(int i=0;i<target_word.length();i++) {
					
					rev=target_word.charAt(i)+rev; 
				}
			}else {
				rev=s+rev;
			}
			
			final_result=final_result+rev+" ";
		}
			
		System.out.println(final_result);	

	}
// https://meet.google.com/nbk-pojf-ewk
}
