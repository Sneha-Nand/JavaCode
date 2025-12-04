// global variable - Any variable that is declared outside any method 
// but inside the class is called as Global variable 
// The scope of global variable is from start of the class till the end of the class 
// Global variables can be distinguish between statatic and nonstatic 
// Global variables have default value for each datatype 
// byte , short, int , long - default value is - 0 
// double - 0.0 
// boolean - false 
// string - null 
// char - default value is not defined in java 
// global variable can be declared and initiated in a single line 

package pack03122025;

public class Pro38 {
	
	static int age = 43; // global variable 
	
	public static void main(String args[])
	{
		int a = 10;  // local variable
		System.out.println(a);
		System.out.println(age);
	}

}
