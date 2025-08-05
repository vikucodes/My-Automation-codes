package DailyUpdate;

import java.util.ArrayList;
import java.util.List;

public class ShiftEvenandOdd {

	public static void main(String[] args) {
		
		int [] a= {2,3,6,5,4,9,8,7,5,6,12,36,63};
		
		List<Integer> even_list=new ArrayList<Integer>();
		List<Integer> odd_list=new ArrayList<Integer>();
		
		
		for(int s:a) {
			
			if(s%2==0) {
				even_list.add(s);
			}else if(s%2!=0) {
				odd_list.add(s);
			}
		}
		
		int index=0;
		for(int even:even_list) {
			
			a[index++]= even;
		}
		
			
		for(int odd:odd_list) {
			a[index++]=odd;
		}
		
		for(int num:a) {
			
			System.out.print(num+ " ");
			
		}
				
			}
		
	}

