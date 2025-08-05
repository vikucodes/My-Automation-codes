package OopsCocept;

public class consp {
int sid;
String sname;
int srank;
consp(int id,String name,int rank){
	
	sid=id;
	sname=name;
	srank=rank;
	
	
}
void display() {
	System.out.println(sid+" "+sname+" "+srank);
}
	
	public static void main(String[] args) {
		
		consp c=new consp(120,"hunny",1) ;
		c.display();
		}
		
	}


