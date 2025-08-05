package arrays;

public class evenaAndodd {

	public static void main(String[] args) {
		int a[]= {10,12,15,16,18,15,19,17,333,66,660};
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println("Even no"+ " "+a[i] );
			}else if(a[i]%2!=0) {
				System.out.println("Odd no"+" "+a[i]);
			}
		}

	}

}
