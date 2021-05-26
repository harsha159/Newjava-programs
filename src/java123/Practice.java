package java123;

public abstract class Practice{
	   abstract void run();
	 }

	 class Honda4 extends Practice{
	 void run(){System.out.println("running safely..");}

	 public static void main(String args[]){
		 Practice obj = new Honda4();
	  obj.run();
	 }
	 }
