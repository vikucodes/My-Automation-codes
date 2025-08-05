package String;

public class find_longest_string {

	public static void main(String[] args) {
		
		String input="john and chadwick are not brother";
		
String [] after_split=input.split(" ");
		
		String longest="";
		
		for(String p:after_split) {
			
		if(p.length()>longest.length()) {
			
			longest=p;
		}

	}
System.out.println(longest);
}
}