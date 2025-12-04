// for loop - to print even and odd numbers from 0 to 100
package core;

public class Pro31 {

	public static void main(String args[])
	{ //int i =0;
		for (int i=2; i<=100; i++)
		{
			if(i%2==0)
			{
				System.out.println( + i + " - Even Number");
			}
			else
			{
				System.out.println( +i+ " - Odd Number");
			}
		}
	}
}
