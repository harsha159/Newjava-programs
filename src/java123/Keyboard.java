package java123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Keyboard {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter: " );
		
		String ch=(String)br.readLine();
		
		System.out.println("Enter id: ");
		
		int i=Integer.parseInt(br.readLine());
		
				
		System.out.println("me:"+ch);
		
		System.out.println("me:"+i);

	}

}
