// calling non static method
package core;

public class Pro5 {
	void add()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Addition of Two numbers :" + c);
	}

	void sub()
	{
		int a = 10;
		int b = 20;
		int c = b - a;
		System.out.println("Subtraction of Two numbers is :" +c);
	}
	
	public static void main(String args[])
	{
		Pro5 p = new Pro5();
		p.add();
		p.sub();
	}
}
