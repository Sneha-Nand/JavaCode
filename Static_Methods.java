//program to create a static method along with a main method that performs addition, subtraction, multiplication, and division.
package basicPrograms;

public class Static_Methods {

	public static void add()
	{
		int a = 10;
		int b = 20;
		System.out.println("Addition is " +(a+b));
	}
	public static void sub()
	{
		int a = 10;
		int b = 20;
		System.out.println("Subtraction is " +(a-b));
	}
	public static void mul()
	{
		int a = 2;
		int b = 3;
		System.out.println("Multiplication is " +(a*b));
	}
	public static void div()
	{
		int a = 30;
		int b = 10;
		System.out.println("Division is " +(a/b));
	}
	public static void main(String[] args) {
		// call static methods directly using method name
		add();
		sub();
		mul();
		div();
	}

}
