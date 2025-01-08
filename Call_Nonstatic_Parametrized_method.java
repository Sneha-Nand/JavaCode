//program to call a Non-Static Method Parameterized method 
package basicPrograms;

public class Call_Nonstatic_Parametrized_method {
	
	public void add(int a , int b)
	{
		System.out.println("Parametrized Addition " + (a+b));
	}
	public void sub(int a , int b)
	{
		System.out.println("Parametrized Subtraction " + (a-b));
	}
	public void mul(int a , int b)
	{
		System.out.println("Parametrized Multiplication " + (a*b));
	}
	
	public static void main(String[] args) {
		Call_Nonstatic_Parametrized_method c1 = new Call_Nonstatic_Parametrized_method();
		c1.add(10,15);
		c1.sub(10,5);
		c1.mul(2, 3);
	}
}
