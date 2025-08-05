package Dailypractice;

public class practiceOccurance {

	public static void main(String[] args) {
		
		String word="programming aman vikas deepak sunny deol";
		
		
	 String [] spl=word.split(" ");
	 String target="aman";
	 int count=0;
	 
	for(String p:spl) {
		
		if(p.equals(target)) {
			count++;
		}
	
	}
	System.out.println(count);     
	}

}
