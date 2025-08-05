package DailyUpdate;

public class day8 {

	public static void main(String[] args) {
		
		String str="name is unique thing in this world";
		
		String [] split=str.split(" ");
		
		String res="";
		
		char ch;
		String name="unique";
		for(String p:split) {
			
			String result="";
			
			
				
			if(p.equals(name)) {
				for(int i=name.length()-1;i>=0;i--) {
				
				result=result+name.charAt(i);
				}
			} else {
				result=p;
			}
			res+=result+" ";
				
			}
			
			System.out.println(res.trim());
			
			
		}

}
