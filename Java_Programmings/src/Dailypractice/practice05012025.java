package Dailypractice;

public class practice05012025 {
	
	public static void main(String [] args) {
		
		String name="rome was not build in a day";
		
		String[] split=name.split(" ");
		
		String target1="rome";
		
		String target2="day";
		
		String final_result="";
		
		for(String p:split) {
			
			String result="";
			//String result1="";
			
			if(p.equals(target1)||p.equals(target2)) {
				
				for(int i=0;i<=target1.length();i++) {
				for(int j=0;j<=target2.length();j++) {	
					
					result=target1.charAt(i) +target2.charAt(j)+result;   //   emor
					
				}
			
				}
			
		}
			else {
				
				result+=p; //result=result+p;
			}
			final_result=final_result+result+" ";
		}
		
		System.out.println(final_result);
	}

}
