package java123;

public class Vowels {

	public static void main(String[] args) {
		
		int count=0;
		String s="Stay home stay safe and wear a mask in this pandemic";
		
		char ch[]=new char[s.length()];
		
		for(int i=0; i< s.length();i++) {
			
			ch[i] = s.charAt(i);
			
			
			
			
			if(ch[i]== 'a' ||ch[i]=='e' ||ch[i]=='i' ) {
				
				
			}
			else {
				count++;
				
			}
		}
		System.out.println(count);
	}
}

			
		  /* String s="StaySafe";
		   int count=0;

		   char[] ch = new char[slength()];
		     
		      
		    for (int i = 0; i < s.length(); i++) {
		          ch[i] = s.charAt(i);
		     
		      if (ch[i]== 'a' || ch[i]== 'e'||ch[i]== 'i'||ch[i]=='o'||ch[i]=='u'){
		      
		      }
		      else{
		      
		      count++;
		      }
		     
		     }
		    System.out.println(count);
		
	}
	}*/
		
