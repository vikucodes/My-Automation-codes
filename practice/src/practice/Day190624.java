package practice;

public class Day190624 {

	public static void main(String[] args) {
		
		String name="42vikas 54kuma45r";
		String result="";
		String result1="";
		char ch;
		//char ch1;
		for(int i=0;i<name.length();i++) {
			ch=name.charAt(i);
	
		//if(Character.isLetterOrDigit(ch)) {
			if(!Character.isDigit(ch)) {
				result=result+ch;	
			}
			
		}
		System.out.println(result);	
		String name1="545@#$vik$%as 25*&^KUma$%r";
		
		String result2=name1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(result);
		
		String pal="MADAM";
		String res="";
		
		char ch3;
		
		for(int i=0;i<pal.length();i++) {
			
			ch3=pal.charAt(i);
			res=ch3+res;
		}
		System.out.println(res);
		if(pal.equals(res)) {
			System.out.println(true);
			
		}else {
			System.out.println(false);
		}
		
		String u="vikas@gmail.com";
		String []a=u.split( "@");
		//int o;
		for(String o:a) {
		System.out.println(o);
		
		}
	
	
	} 
	
}

