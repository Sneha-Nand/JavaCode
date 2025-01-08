//Program using OR operator
package conditionalStatements;

public class OR_Operator {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 15;
		
		if(a > 10 || b == 15)
		{
			System.out.println("OR operator - A is False , B is True");
		}
		
		if (a >=10 || b<15)
		{
			System.out.println("OR operator - A is True, B is False");
		}
		
		if(a == 10 || b==15 )
		{
			System.out.println("OR operator - A and B both are True");
		}
		
	}
}
