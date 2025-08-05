package String;

public class reverseword {

	public static void main(String[] args) {
		String name="JOhn is not the worthiest man in this world";
		
		String splitarray[]=name.split(" ");
		for(int i=splitarray.length-1;i>=0;i--) {

		
			System.out.print(splitarray[i]+ " ");
		}	
		
}
}