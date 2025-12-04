// circumference of a circle- 2*pi*r
package pack04122025;

public class Pro50 {

	final static double pi = 3.14;
	 static int r = 10;
	 
	static void area() 
	{
		double a = pi*r*r;
		System.out.println("Area is " +a);
	}
	
	static void circum()
	{
		double c = 2*pi*r;
		System.out.println("Circimference is " + c);
	}
	
	public static void main(String args[])
	{
		
		System.out.println("Circle");
		area();
		circum();
	}
}
