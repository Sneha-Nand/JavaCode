package pack04122025;

public class Pro46 {

	String name = "sita";
	int age = 19;
	double weight = 70.98;
	
	void add()
	{
		System.out.println("Hey my bio data is " +name + " , " + age + " , " + weight  );
	}
	
	public static void main (String args[]) {
		Pro46 p = new Pro46();
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.weight);
		
		p.add();
	}
}
