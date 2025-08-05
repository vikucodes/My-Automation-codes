package practiceoopsconcept;

public class student_2 {
	
	int roll;
	int id;
	String name;
	
	student_2(){
		
		roll=roll;
		id=id;
		name=name;
	}
	
	void printdata() {
		System.out.println(roll+" "+id +" "+name);
	}

	public static void main(String[]args) {
		
		student_2 stud=new student_2();
		
		stud.id=1112;
		stud.name="john";
		stud.roll=12;
		
		stud.printdata();
	}
	
}
