package String;

public class replace_character {

	public static void main(String[] args) {
		
		String name="charles";
		
		String Result="";
		
		char ch;
		
		for(int i=0;i<name.length();i++) {
			
			ch=name.charAt(i);
			
			if(ch=='a') {
				
				Result=Result+'o';
				
			}else {
				
				Result=Result+ch;
			}
		}
	//	System.out.println(Result.length());
System.out.println(Result);
	}

}
