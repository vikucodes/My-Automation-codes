package DailyUpdate;

public class shift_evena_odd_charceter {

	public static void main(String[] args) {
		/*  String name = "java and compiler";
	        
	        // Initialize two strings to store odd and even indexed characters
	        String oddChars = "";
	        String evenChars = "";
	        String reverse="";
	        // Loop through the string and separate odd and even indexed characters
	        for (int i = 0; i < name.length(); i++) {
	            if (i % 2 == 0) {
	                evenChars += name.charAt(i);  // Even index characters
	            } else {
	                oddChars += name.charAt(i);   // Odd index characters
	            }
	        }
	        
	        // Concatenate odd characters with even characters
	        String result = oddChars + oddChars.reverse().toString();
	        
	        // Print the result
	        System.out.println(result);
	    }
	
	}*/
		
		 String name = "java and compiler";
	        
	        // StringBuilder to store result
	        StringBuilder oddChars = new StringBuilder();
	        StringBuilder evenChars = new StringBuilder();
	        
	        // Iterate through the string and separate odd and even indexed characters
	        for (int i = 0; i < name.length(); i++) {
	            if (i % 2 == 0) {
	                evenChars.append(name.charAt(i));  // Even index characters
	            } else {
	                oddChars.append(name.charAt(i));   // Odd index characters
	            }
	        }
	        
	        // Concatenate odd characters with even characters
	        String result = oddChars.toString() + oddChars.reverse().toString();
	        
	        // Print the result
	        System.out.println(" "+ result);
	    }
	}

