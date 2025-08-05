package DailyUpdate;

public class day9 {

	public static void main(String[] args) {
		
		
		String name="Tom and Jerry are not good friend";
		
		String [] split=name.split(" ");
		
		
		String final_res="";
		
		String target_word="Tom";
        for(int j=0;j<split.length;j++) {
        	String rev_word="";
        	if(j==0) {
        		
        	}else if(j==split.length-1) {
        		
        	}
        }
		for(String p:split) {
			
			String res="";
			
			if(p.equals(target_word)) {
				
				for(int i=target_word.length()-1;i>=0;i--) {
					
					res=res+target_word.charAt(i);
					//System.out.println(res);
				}
			}else {
				
				res+=p;
			}
			
			final_res=final_res+res+ " ";
		}
		
		System.out.println(final_res);
	}

}
