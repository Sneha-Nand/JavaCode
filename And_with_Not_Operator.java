//program using the AND with NOT operator
package conditionalStatements;

public class And_with_Not_Operator {
	public static void main(String[] args) {
		
		int a = 110;
		int b = 10;
		
		if(a!=10 && b!=10)
		{
			System.out.println("A and B are not equal to 10 ");
		}
		else if(a==10 && b==10)
		{
			System.out.println("A and B are equal to 10");
		}
		else
		{
			System.out.println("A and B are not equal ");
		}
	}

}
