// Local variable - Any variable that is declared inside any method is call as Local Variable 
// The scope of the Local variable is from starting of the method til the end of the method. 
// Local variable need to be initialized before using 
// Local variable do not have default value 
// Local variables can be declared and initialized in two line 
// Local variable cannot be distinguish between static and nonstatic

package pack03122025;

public class Pro37 {
	
	static void add()
	{
		int a ; // local variable inside add method
		a = 12;
		System.out.println(a);
	}
	
	public static void main(String args[]) {
		int a ; // local variable inside main method
		a = 10;
		System.out.println(a);
		add();
	}
}
