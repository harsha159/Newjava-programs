package java123;

public class StringDub {

	public static void main(String[] args) {
       String s="Great responsibility";
		
		int count;
		
		//CONVERT string1 into char string[]
		char String[] =s.toCharArray();
		
		
		 for(int i = 0; i <s.length(); i++) {    
	            count = 1;    
	            for(int j = i+1; j <s.length(); j++) {    
	                if(String[i] == String[j] && String[i] != ' ') {    
	                    count++;    
	                    //Set string[j] to 0 to avoid printing visited character    
	                    String[j] = '0';    
	                }    
	            }    
	            //A character is considered as duplicate if count is greater than 1    
	            if(count > 1 && String[i] != '0')    
	                System.out.println(String[i]);
			
			
			
			
			
			
			
			
		}
			

	}

}
