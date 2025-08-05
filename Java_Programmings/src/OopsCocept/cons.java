package OopsCocept;

public class cons {
//Default constructor
	int sid;
	int srank;
	
	cons(){
		 sid=100;
		 srank=1;
		
	}
	
	public static void main(String[] args) {
		
		cons c=new cons();
		System.out.println(c.sid+" "+c.srank);
	}

}
