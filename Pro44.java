package pack04122025;

public class Pro44 {

	String name = "Sita";
	int age = 19;
	double weight = 90.87;
	
	void add (String name, int age, double weight)
	{
		System.out.println("Hey my bio data is " + name + "," + age + ", " + weight );
	}
	
	public static void main(String args[])
	{
		Pro44 p = new Pro44();
		
		System.out.println(p.name);
		System.out.println(p.age);
		p.add("Ram", 35, 56.90);
		
	}
}
