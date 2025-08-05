package DailyUpdate;

import java.util.Arrays;

public class day11 {

	public static void main(String[] args) {
		
		String name="john and chales are bestings buddy";
		
		//1.find the longest string
		
		String [] split=name.split(" ");
		
		String longest="";
		for(String p:split) {
			
			if(p.length()>longest.length()) {
				
				longest=p;
				
				
			}
				
		}
		
		System.out.println(longest);
		
		
		//2 find the occurance of string by word
		
		String name1="dimple simple dimple dimple dimlpe simple karan karan hyderabas hyderabad dimple simple";
		
		String [] split1=name1.split(" ");
		
		
		String repeat="dimple";
		
		int count=0;
		
		for(String p1:split1) {
			
			if(p1.equals(repeat)) {
				
				count++;
			}
		}
		
		System.out.println(count+ " ");
		
		//3 Add one string into other with same place
		
			String name3="king queen";
		    String name4="hero chapion";
		
		String[] n=name3.split(" ");
		String []n1=name4.split(" ");
		System.out.println(n[0]+" "+n1[0]+" "+n[1]+" "+n1[1]);
		
		
		
		//4  givin string is anagrom or not
		
		String an="listen";
		String an1="silent";
		
		
		char [] ch=an.toCharArray();
		
		char [] ch1=an1.toCharArray();
		
		
		Arrays.sort(ch);
		Arrays.sort(ch1);
		
		if(Arrays.equals(ch, ch1)) {
			
			System.out.println("given string is anagroms");
		}else {
			
			System.out.println("given string is non anagroms");
		}
		
		
		
		//5 longest string without repeating>need to try later
		
		String str="abcabc accbb abc abbca aaabbbccc";
		
		
		String [] str1=str.split(" ");
		
			String result="";
			
			for(int i1=0;i1<str1.length;i1++) {
				
				for(int j1=1 ;j1<str1.length;j1++) {
					
					
					if(str1[i1]!=str1[j1]) {
						
						
						
						result=str1[i1];
						
					}
				}
				
			}
			
			System.out.println(result);
			
			
			
			//6 find the duplicate character of string
			
			String word="programming";
			
			
			char dup;
			
			int count_dup=0;
			
			char ch2;
			for(int i2=0;i2<word.length();i2++) {
				
				for(int j2=i2+1;j2<word.length()-1;j2++) {
					
					
					if(word.charAt(i2)==word.charAt(j2)) {
						
					dup=	word.charAt(j2);
						
					System.out.println(dup+ " "+ j2 +" "+i2);
					}
				}
				
			}
			
			
			
			//7 convert string to interger
			
			String dem="1234";
			
			try {
		int con=	Integer.parseInt(dem);
			System.out.println(con);
		}catch(Exception e) {
			
			System.out.println("invalid");
		}
			
			//8 reverse a particular string
			
			String str2="name is totally different than cast";
			
			String [] spl=str2.split(" ");
			
			String reverse="";
			
			String target="than";
			
			for(String g:spl) {
				
				String part="";
				
				if(g.equals(target)) {
					
					for(int o=g.length()-1;o>=0;o--) {
						
						part=part+target.charAt(o);
					}
				}else {
					
					part+=g;
				}
				reverse=reverse+part+" ";
			}
			
			System.out.println(reverse);
		
	}
	}


