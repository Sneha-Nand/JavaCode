//Nested if else block
package conditionalStatements;

public class Nested_If_Else 
{
	public static void main(String[] args) 
	{
		int a = 11;
		int b = 5;
		int c = 3;
		
		if(a==10 & c==3 )
		{
			if(b==5)
			{
				System.out.println("A is equal to 10 and B is equal to 5");
			}
			else
			{
				System.out.println("A is equal to 10 and B is gretar than 5");
			}
		}
		else
		{
			System.out.println("A is greater than 10");
		}
		
	}
}
