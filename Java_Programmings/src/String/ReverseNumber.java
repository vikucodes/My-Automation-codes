package String;

public class ReverseNumber {

	public static void main(String[] args) {
		
		String name="My name is anthony gonsalvesh";
		String res="";
		char a;
		for(int i=0;i<name.length();i++) {
		
		a=name.charAt(i);
		
		res=a+res;
		}
System.out.println(res);
	}

}
