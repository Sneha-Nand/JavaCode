//calling non static method
package core;

public class Pro4 {

	void mod()
	{
		int a = 99;
		int b = 5;
		int c= a%b;
		System.out.println("Modulus of Numbers is : " + c);
	}
	
	public static void main(String args[])
	{
		Pro4 p = new Pro4();
		p.mod();
	}
}
