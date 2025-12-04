// Logical AND, OR - BOzdMAS rule
package core;

public class Pro23 {
	public static void main(String args[]) {
		
		int a= 10;
		int b = 20;
		
		if (a<10 || b<20)
		{
			System.out.println("OR operator");
		}
		else if(a==10 && b==20)
		{
			System.out.println("AND operator");
		}
		else
		{
			System.out.println("No Oerator");
		}
	}

}
