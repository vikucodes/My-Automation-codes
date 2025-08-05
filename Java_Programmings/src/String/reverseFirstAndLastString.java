package String;

public class reverseFirstAndLastString {

	public static void main(String[] args) {
		
		//reverse 1st and last string

		String word="john and charles are two player ";
		
		String [] splitted=word.split(" ");
		
	    String	target="john";
	
	    String target2="player";
	    
	    String res="";
	    for (int i = 0; i < splitted.length; i++) {
            String name = splitted[i];
            String result = "";
	    if (name.equals(target) || name.equals(target2)) {
            // Reverse the word
            for (int j = name.length() - 1; j >= 0; j--) {
                result += name.charAt(j);
            }
        } else {
            // Otherwise, keep the word as it is
            result = name;
        }
        
        res += result + " ";  
    }

    // Output the final result
    System.out.println(res.trim());
}
}