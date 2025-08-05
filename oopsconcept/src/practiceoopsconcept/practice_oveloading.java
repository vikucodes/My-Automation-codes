package practiceoopsconcept;

public class practice_oveloading {
	
	
	
	int a=10 ,b=20;
	
	void sum() {
		System.out.println(a+b);
	}
	
	void sum(int x,int y) {
		System.out.println(x+y);
	}
	
	void sum(int x,double y) {
		
		System.out.println(x+y);
	}
    void sum(double x,int y) {
    	System.out.println(x+y);
    }
	
	void sum(int x,int y,int z) {
		System.out.println(x+y+z);
	}

	public static void main(String[] args) {
		
		practice_oveloading po=new practice_oveloading() ;
		
		po.sum();
		po.sum(20, 30);
		po.sum(12, 15.27);
		po.sum(1, 11);
		po.sum(15,15,60);
			
			
		
	}

}
