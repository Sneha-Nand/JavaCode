// constructor overloading
package core;

public class Pro7 {
	
	Pro7()
	{
		System.out.println("Constructor with no parameter");
	}
	
	Pro7(int a)
	{
		System.out.println("Constructor with one int paramter:" +a);
	}
	
	Pro7(double b)
	{
		System.out.println("Constructor with one float paramter:" +b);
	}
	
	Pro7(char c)
	{
		System.out.println("Constructor with one character:" +c);
	}
	
	Pro7(String str)
	{
		System.out.println("Constructor with String:" +str);
	}
	public static void main (String args[]) 
	{
		new Pro7();
		new Pro7 (10);
		new Pro7(20.00);
		new Pro7('s');
		new Pro7("Sneha");	
	}
}
