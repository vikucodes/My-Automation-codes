package String;

public class check_if_string_contains_only_digit {

	public static void main(String[] args) {
		
		String name="vik21as 15k8uma4ar";
		
		String result="";
		
		char ch;
		
		for(int i=0;i<name.length();i++) {
			
			ch=name.charAt(i);
			
			if(Character.isDigit(ch)) {
				
				result=result+ch;
			}
		}
System.out.println(result);
	}

}
