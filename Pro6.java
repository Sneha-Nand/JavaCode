package core;

public class Pro6 {
	
	Pro6()
	{
		System.out.println("Non Parameterized constructor");
	}
	
	Pro6(int a)
	{
		System.out.println("Parameterized constructor");
	}
	
	public static void main(String args[])
	{
		new Pro6();
		new Pro6(10);
	}

}
