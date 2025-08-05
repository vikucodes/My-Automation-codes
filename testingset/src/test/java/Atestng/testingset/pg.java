package Atestng.testingset;

public class pg {
  String carname;
  int carprice;
  String carmodel;
   
  public void display() {
	  System.out.println(carname);
	  System.out.println(carprice);
	  System.out.println(carmodel);
  }
	
	public static void main(String[] args) {
		
		pg PG=new pg();
		
		PG.carmodel="Audi";
		PG.carprice=150000;
		PG.display();
		
	}
}

