package oopsconcept;

 class typecasting {

	String name="Raina";
	
	void t() {
		System.out.println("calling raina");
	}
	
	class B extends typecasting{
		int id=10;
		void t1() {
			
			System.out.println("given int value");
		}
		
	}

	
	
	
	public static void main(String[] args) {
		
		typecasting type=new typecasting();
		
		System.out.println(type.name);
		//System.out.println(type.t());
		

	}

}
