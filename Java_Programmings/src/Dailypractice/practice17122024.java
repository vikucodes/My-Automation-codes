package Dailypractice;

public class practice17122024 {

	public static void main(String[] args) {
		
		/*String name="hellowing how are you sanjana";
		
		String [] ip=name.split(" ");
		
int len=0;
		
		for(int i=0;i<ip.length;i++) {
			
			//for(int j=i+1;j<ip.length;j++) {
				
				if(ip[i].length()>len) {
					
					len=ip[i].length();
				}
			}
			
		
		System.out.println(len);
		
		
		String name="vikash";
		
		int total_length=name.length();
		
		int middle =total_length/2;
		
		int sec_middle=total_length/2-1;
		System.out.println(name.charAt(middle));
		System.out.println(name.charAt(sec_middle));*/
		
		
		String word="hey john and charles where are you going";
		
		char target='e';
		
		int count=0;
		
		for(int i=0;i<word.length();i++) {
			
			if(word.charAt(i)==target) {
				
				count++;
				
				
				
			}
		}

System.out.println(count);
	}

}
