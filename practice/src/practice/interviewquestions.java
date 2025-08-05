package practice;

public class interviewquestions {

	public static void main(String[] args) {
		
		//Swaping method     
		//int a=20;     
		//int b=10;       
		/*  int t;    
		 t=a+b;     a=b;     b=t;    
		 System.out.println(a+ " " +b);        
		  //logic2          
		a=a+b;//30    
		 b=a-b;//20    
		 a=a-b;//10     
		System.out.println(a+ " " +b);        
		  //reverse no.         
		 //int k=1234;          
		//
		 * StringBuilder
		 *  sb1=new StringBuilder(k);       
		 *   //sb1.append(k);    
		 *   //StringBuilder rev=sb1.reverse();    
		 *        //System.out.println(rev);        
		 *    //By StringBuffer 
		 *      int k=1234;    
		 *   StringBuffer sb2=new StringBuffer(String.valueOf(k)); 
		 *      StringBuffer j=sb2.reverse();  
		 *     System.out.println(j);       
		 *   //Reverse string   
		 *    String k="How are you";  
		 *     StringBuffer str=new StringBuffer(k);  
		 *     StringBuffer res=str.reverse();   
		 *    System.out.println(res);           
		 *      //Count no.        
		 *    int no=123456;   
		 *    int Count= 0;         
		 *   while(no>0) {     
		 *    no=no/10;     
		 *    Count++;         
		 *     }    
		 *   System.out.println(Count);  
		 *          //Find even and odd no.    
		 *        int a=1234;  
		 *     int even_count=0;  
		 *     int odd_count=0;        
		 *         while(a>0)
		 *   {     int rem=a%10;    
		 *    if(rem%2==0) {      
		 *    //System.out.println("even no");     
		 *        even_count++;   
		 *      }     else   {  
		 *       odd_count++;
		 *         }   

             a=a/10;     
   }   
   System.out.println(even_count);  
    System.out.println(odd_count);      
     //Sum of digit         
  int a=1234;    
  int sum=0;         
  while( a>0) {            
   sum=sum+a%10;     
   a=a/10;     
 }     
 System.out.println(sum);    
       int a=10; 
     int b=15;   
   int c=20;         
  if(a>b && a>c) {     
   System.out.println("a is greater");  
    }     else if (b>a && b>c)
  {   
   System.out.println("b is greter");  
      }     else{       
		      System.out.println("c is greater" + " "+ c);*/
		
		//reverse a no.
		
		String fame="How are you ji";
		StringBuilder str=new StringBuilder(fame);
		str.append(fame);
		StringBuilder rev=str.reverse();
		
		System.out.println(rev);
		
	}

}
