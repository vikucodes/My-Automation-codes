package oopsconcept;

public class inter3 implements inter1 ,inter2{

	public static void main(String[] args) {
		inter3 obj=new inter3();
		obj.m1();
		obj.m2();
	}

	public void m2() {
		System.out.println(y);
		
	}

	public void m1() {
		// TODO Auto-generated method stub
		System.out.println(x);
	}

}
