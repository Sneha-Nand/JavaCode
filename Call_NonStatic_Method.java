//program to call a Non-Static Method
package basicPrograms;

public class Call_NonStatic_Method {
	
	public void add()
	{
		System.out.println("This is NonStatic Method");
	}
	public static void main(String[] args) {
		Call_NonStatic_Method a1 = new Call_NonStatic_Method();
		a1.add();
	}
}
