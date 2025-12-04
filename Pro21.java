// Logical operator - AND
package core;

public class Pro21 {
	public static void main(String args[])
	{
		int a = 4;
		int b = 30;
		
		if(a<=45 && b>=35)
		{
			System.out.println("Person is Middle aged");
		}
		else if(a>45 && b > 45)
		{
			System.out.println("Old Age person");
		}
		else
		{
			System.out.println("Young person");
		}
	}
}
