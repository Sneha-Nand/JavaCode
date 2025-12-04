// update value of global variable 

package pack04122025;

public class Pro43 {
	String name = "Postman";
	
	public static void main(String args[])
	{
		Pro43 p = new Pro43();  // As the global variable was non static created an object of that
		p.name = "Sneha";
		System.out.println(p.name);
	}
	
	

}
