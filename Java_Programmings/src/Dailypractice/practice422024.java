package Dailypractice;

public class practice422024 {

	public static void main(String[] args) {
	 
		/*String word="Delhi is capital of India";
		
		//reverse each word
		
		String [] splited_word=word.split(" ");
		
		String reverse_word="";
		
		for(String after_split:splited_word) {
			String rev = "";
			
			for(int i=after_split.length()-1;i>=0;i--) {
				rev=rev+after_split.charAt(i);
				//System.out.println(rev);
			}
			reverse_word=reverse_word + rev +" ";
		}
		
		System.out.println(reverse_word);*/
		
		
		int [] input= {10,11,12,13,14,15,6,8};
		
		int even=0;
		int odd=0;
		
		for(int i=0;i<input.length;i++) {
			
			if(input[i]%2!=0) {
				
				System.out.println(input[i]);
				
				odd=input[i]+odd;
				
				
			}else if(input[i]%2==0){
				
				System.out.println(input[i]);
                 even=input[i]+even;	
                 
                
				
			}
		}
		 System.out.println(even);
		 System.out.println(odd);
	}
	

}
