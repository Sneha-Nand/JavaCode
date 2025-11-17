// static methods
package core;

public class Pro3 {
	 
		static void add()
		{
			int a = 10;
			int b = 20;
			int c = a + b;
			System.out.println("Addition of two numbers is: " + c);
		}
		
		static void sub()
		{
			int a = 10;
			int b = 20;
			int c = b - a;
			System.out.println("Subtraction of two numbers is: "+ c);
			
		}
		
		static void div()
		{
			int a = 60;
			int b = 20;
			int c = a/b;
			System.out.println("Division of Two numbers is: "+ c);
		}
		
		static void mul()
		{
			int a = 3;
			int b = 4;
			int c = a*b;
			System.out.println("Multiplication of Two numbers: "+ c );
		}
		
	public static void main(String args[])
	{		
		add();
		mul();
		sub();
		div();
		
	}

}
