package oopsconcept;


//Method overloading

public class polymorphism {
	/*int a=10  ,b=20;
 void sum() {
	 System.out.println(a+b);
	 
 }
 
 void sum(int x ,int y) {
	 System.out.println(x+y);
 }
 void sum(int x,double y) {
	 System.out.println(x+y);
 }
 void sum(int a , int b ,int c) {
	 System.out.println(a+b+c);*/
	
	int a1=50 ,b1=110;
	
	void sum() {
		System.out.println(a1+b1);
	
	
	}
	
	void sum(int X1 ,int Y1) {
		System.out.println(X1+Y1);
	}
	
	void sum(int X1 ,double R) {
		System.out.println(X1+R);
	}
	
	public static void main (String[]args) {
		polymorphism pol =new polymorphism();
		
		pol.sum();
		pol.sum(100, 50.66);
		pol.sum(10, 630);
	}
 }
 

