package practiceoopsconcept;

public class student_1 {
	
	int sroll;
	char sgrade;
	int smarks;
	String ssubject;
	
	
	student_1(int roll,char grade,int marks,String subject) {
		
		sroll=roll;
		sgrade=grade;
		smarks=marks;
		ssubject=subject;	
		
	}
	
	void printdata() {
		System.out.println(sroll +" "+ sgrade +" " +smarks+" "+ssubject);
	}
	
 public static void main(String[]args) {
	 
	 student_1 stu=new student_1(10,'A',152,"Math");
	 
	stu.printdata();
	 
	 
	 
 }
}
