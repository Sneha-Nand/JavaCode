// count of digits, numbers, space, special characters
package core;

import java.util.Arrays;

public class Array4 {
	static int count_of_digit =0;
	static int count_of_alphabets = 0;
	static int count_of_space = 0;
	
	
	public static void main(String args[])
	{
		String s = "Salary of Ram is 9088765#$%%";
		
		char c1[] = s.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i=0;i<s.length();i++)
		{
			boolean b1 = Character.isDigit(c1[i]);
			if(b1==true)
					{
				count_of_digit++;
					}
			
			boolean b2 = Character.isLetter(c1[i]);
			if(b2==true)
			{
				count_of_alphabets++;
			}
			
			boolean b3 = Character.isSpaceChar(c1[i]);
			if(b3==true)
			{
				count_of_space++;
			}
		}
		System.out.println("Count of digits is "+count_of_digit);
		System.out.println("Count of alphabets is "+count_of_alphabets);
		System.out.println("Count of space is "+count_of_space);
	}
	}


