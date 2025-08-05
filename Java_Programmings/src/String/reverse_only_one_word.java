package String;

public class reverse_only_one_word {

	public static void main(String[] args) {
		
		String name="Tom and Jerry are not good friend";
		String [] arr=name.split(" ");
		
		String reverse_word="";
		
		String after_reverse="";
		
//		for(int i=0;i<name.length();i++) {
//			if(!arr[i].equals("jerry")) {
//				reverse_word=reverse_word+ " "+arr[i];
//				
//			}else {
//				for(int j=0;j<arr[i].length()-1;j++) {
//					after_reverse=arr[i].charAt(j)+after_reverse;
//				}
//				reverse_word=reverse_word+" "+after_reverse;
//			}
//		}
//		System.out.println(reverse_word);
//	}
//
//}
		   for (int i = 0; i < arr.length; i++) {  // Loop through the length of arr, not name
	            if (!arr[i].equalsIgnoreCase("jerry")) {  // Case insensitive comparison
	                reverse_word = reverse_word + " " + arr[i];
	            } else {
	                after_reverse = "";  // Reset after_reverse for each word
	                for (int j = arr[i].length() - 1; j >= 0; j--) {  // Reverse the word "Jerry"
	                    after_reverse = after_reverse + arr[i].charAt(j);
	                }
	                reverse_word = reverse_word + " " + after_reverse;
	            }
	        }
	        
	        System.out.println(reverse_word.trim());  // Print the result without leading space
	    }
	}
