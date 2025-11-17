// Method Overload 
package core;

public class Pro9 {
	
	static void add(int a, int b)
	{
		
		int c = a +b;
		System.out.println("Addition of Two numbers is:" +c);
	}
	
	void add(int a,int b,int c)
	{
		
		int d = a+b+c;
		System.out.println("Addition of Three numbers is :" +d);
	}
	
	public static void main(String args[])
	{
		add(20,30);
		Pro9 p = new Pro9();
		p.add(20, 30, 40);
		
	}

}
