// operations using static methods 
package pack04122025;

public class Pro48 {
	
	static int a = 20;
	static int b = 20;
	
	static void add()
	{
		System.out.println("Addition is " +(a+b));
	}
	
	static void sub()
	{
		System.out.println("Subtraction is " +(b-a));
	}
	
	static void mul()
	{
		System.out.println("Multiplication is " +(a*b));
	}
	static void div()
	{
		System.out.println("Division is " +(b/a));
	}
	
	public static void main (String args[])
	{
		add();
		sub();
		mul();
		div();
	}
}
