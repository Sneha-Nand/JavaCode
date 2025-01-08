//Program using And operator
package conditionalStatements;

public class And_Operator {

	public static void main(String[] args) {
		
		int age = 30;
		char gender = 'M';
		
		if(age > 10 && gender=='F')
		{
			System.out.println("Eligible for Half Ticket");
		}
		
		if(age > 10 && gender=='M')
		{
			System.out.println("Eligible for Full Ticket");
		}
	}

}
