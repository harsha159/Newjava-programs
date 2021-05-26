package java123;

public class StringCount {

	public static void main(String[] args) {
	
		
		String s="harsha sunkara";
		
		int count=0;
		
		
		for(int i=0;i<s.length();i++)	{	
			
			if(s.charAt(i) !=' ') 
				
			count++; 
		}
		System.out.println(count);
		
		

	}

}
