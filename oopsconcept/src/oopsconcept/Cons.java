package oopsconcept;

public class Cons {
int Sid;
String Sname;
int Ssalary;

	Cons(int id,String name,int salary){
	Sid = id;
	Sname = name;
	Ssalary = salary;
	}
	
	public static void main(String[] args) {
		
		Cons c=new Cons(101 ,"David" ,500000);
		System.out.println(c.Sid +" " +c.Sname  +" " + c.Ssalary);
	}

}
