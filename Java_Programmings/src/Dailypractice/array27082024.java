package Dailypractice;

import java.util.Arrays;

public class array27082024 {

	public static void main(String[] args) {

  int []a= {10,20,30,70,80,85,50,60};
  int thirdlar=a[0];
  int lar=a[0];
      
  Arrays.sort(a);
  
  for(int i=0;i<a.length-2;i++) {
	  if(thirdlar<a[i]) {
		  thirdlar=a[i];
		 
//	  }else if(thirdlar>a[i]){
//		  thirdlar=a[i];
//		  
	  }
  }
  System.out.println(thirdlar);
  
	}
}

