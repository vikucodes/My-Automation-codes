package Dailypractice;

public class practicearray04112024 {

	public static void main(String[] args) {
		
		int [] a= {10,30,50,4,90,80,15};
		
		/*int [] b= {10,40,50,16,9,20};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<b.length;j++) {
				
				if(a[i]==b[j]) {
					
					a[i]=b[j];
					System.out.println(a[i]);
				}
			}
		}*/
		
	/*for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println("even no: " + a[i]);
			}else {
				System.out.println("odd no."+a[i]);
			}
		}*/
		
		
		int largest_num=0;
		int sndhighest_num=0;
		//int thirdmax=0;
		for(int i=0;i<a.length;i++) {
			if(largest_num<a[i]) {
				sndhighest_num=largest_num;
				largest_num=a[i];
			}else if(sndhighest_num<a[i]){
				sndhighest_num=a[i];
				
			}else if(thirdmax<a[i]) {
			//	thirdmax=a[i];
			}
			
		}
		System.out.println(sndhighest_num);
	//	System.out.println(thirdmax);
	}

}
