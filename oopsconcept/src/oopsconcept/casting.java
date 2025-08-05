package oopsconcept;


class parent{
	int x=41;
	
	void c1() {
		System.out.println("parent class calling");
	}
}

class child extends parent {
	
	String name="John ";
	
	void c2() {
		System.out.println("Child class calling");
	}
}

public class casting {

	public static void main(String[] args) {
		
		child c=  new child();
	System.out.println(c.x);
	c.c1();
	System.out.println(c.name);
	c.c2();
		
		

	}

}
