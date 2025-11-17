// calling static and non static method 
package core;

public class Pro2 {
	
	void nonstati_method()
	{
		System.out.println("This is Non static method ");
	}
	
	static void staticone_method()
	{
		System.out.println("This is Static method");
	}
	
	public static void main(String args[])
	{
		staticone_method();
		Pro2 p = new Pro2();
		p.nonstati_method();

	}
}
