package String;

public class find_middlr_character {

	public static void main(String[] args) {
		
		/*String name="vikas";
		
		 int middle=name.length()/2;
		 
		 
		
		 if(name.length()%2==1) {
			 System.out.println(name.charAt(middle));
		 }else {
			 
			 System.out.println(name.charAt(middle)-1);
		 }*/
		
		String java="Charle";
		
		char [] name=java.toCharArray();
		
		int total_length=java.length();
		
	int middle=total_length/2;
		
       
		
		
	
		System.out.println(java.charAt(middle));

	     System.out.println(java.charAt(middle)-1);
	     
	     char count='a';
	     for(int i=0;i<java.length();i++) {
	    	 
	     
	     if(java.charAt(i)==count) {
	    	 count++;
	     }
		 
		 
				}
	     System.out.println(count);
			}
		
}