package DailyUpdate;

public class day7 {

	public static void main(String[] args) {
	
  String name="madam";
  String res="";
  char ch;
  for(int i=name.length()-1;i>=0;i--) {
	  
	  
	res=res+name.charAt(i);
    
    if(name!=res) {
    	
    	System.out.println("palindrome");
    }else {
    	System.out.println("non plaindrome");
    }
    	
    }
    System.out.println(res);
	}

}
