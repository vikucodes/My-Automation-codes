package Dailypractice;

public class practice25122024 {

	public static void main(String[] args) {
	
		String name="hellow charlie";
		
		String [] split=name.split(" ");
		
		String max="";
		
	
		for(String p:split) {
			
		if(p.length()>max.length()) {
					
					max=p;
					
					
				}
			
		}
		
		System.out.println(max);
		
			
	}
		}
	
