package pack04122025;

public class Pro42 {

	String name = "Postman";
	
	public static void main(String args[])
	{
		// System.out.println(name); we cannot directly access non static variale from static method
		Pro42 p = new Pro42();
		
		System.out.println(p.name);
		
	}
}
