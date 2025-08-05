package practiceoopsconcept;

public class Constructor {
    int sid;
    String sname;
    int srank;
	//Constructor parametrazied 
	Constructor(int id ,String name ,int rank){
		//Defoult constructor
		//Constructor()
		 sid = id;
		 sname = name;
       srank = rank;
		
	
			
		}
		
		
		
	
	
	public static void main(String[] args) {
		
		Constructor con=new Constructor(101,"john" ,5);
		//con.sid=105;
		
		
		System.out.println(con.sid +" "+ con.sname +" "+con.srank);
	}

}
