package core;

public class Prog {
	Prog()
	{
		System.out.println("Constructor");
	}
	
	void method1()
	{
		System.out.println("Non static Method");
	}

	static void method2()
	{
		System.out.println("Static Method");
	}
	
	public static void main(String args[])
	{
		Prog p = new Prog();
		p.method1();
		method2();
	}
}
