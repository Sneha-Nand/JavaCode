//program using the OR with NOT operator
package conditionalStatements;

public class OR_with_Not_Operator {
	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		
		if(a!=20 || b==15)
		{
			System.out.println("OR with Not");
		}
		else if (a==20 && b==15 )
		{
			System.out.println("A is equal 20 and B is equal to 15");
		}
		else
		{
			System.out.println("A is  equal 20 and B is not equal to 15");
		}
	}
}
