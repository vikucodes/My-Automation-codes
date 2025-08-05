package String;

public class occurance_of_character {

	public static void main(String[] args) {
	
		String name="Jai Shree Ram jee";
		
		char ch='e';
		
		int count=0;
		
        for(int i=0;i<name.length();i++) {
        	
        	if(name.charAt(i)==ch) {
        		
        		count++;
        	}
        }
        
        System.out.println(count);
	}

}
