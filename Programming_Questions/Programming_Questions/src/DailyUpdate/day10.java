package DailyUpdate;

public class day10 {

	public static void main(String[] args) {
		
		
		String name="java and compiler are twodjgsdjghsdjkfhsdkjhf  different things";
		
		
		String [] split=name.split(" ");
		
		
		String longest="";
		
		
		for(String p:split) {
			
			if(p.length()>longest.length()) {
				
				longest=p;
			}
		}
		
		System.out.println(longest);
	}

}
