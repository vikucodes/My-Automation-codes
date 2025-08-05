package Atestng.testingset;

public class letsbegin {

	public static void main(String[] args) {
		
		String name="Ram45an si45n54ha4 l5al4";
		
		String result="";
		 char ch;
		 
		 for(int i=0 ;i<name.length();i++) {
			 
			 ch=name.charAt(i);
			 
			 if(!Character.isDigit(ch)){
				 
				 result=result+ch;
			 }
			 
		 }
		 System.out.println(result);
	}

}
