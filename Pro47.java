// operations using non static methods 
package pack04122025;

public class Pro47 {
	
	int a = 20;
	int b = 10;
	
	void add()
	{
		System.out.println("Addition is " +(a+b));
	}
	
	void sub() {
		System.out.println( "Subtraction is " +(a-b));
	}
	
	void mul()
	{
		System.out.println("Multiplication  is " + (a*b));
	}
	
	void div()
	{
		System.out.println( "Division is " +(a/b));
	}
	
	public static void main(String[] args) {
		Pro47 p =new Pro47();
		p.add();
		p.div();
		p.mul();
		p.sub();
		
	}

}
