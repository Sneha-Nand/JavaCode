// String programs
package core;

import java.util.Arrays;

public class Array3 {

	public static void main(String args[])
	{
		String name = "I am Sneha";
		boolean ans = name.contains("Sn");
		System.out.println(ans);
		
		boolean ans1 = name.contains("sn");
		System.out.println(ans1);
		
		boolean ends = name.endsWith("eha");
		System.out.println(ends);
		
		boolean ends1= name.endsWith(" eha");
		System.out.println(ends1);
		
		char name1[] = name.toCharArray();
		System.out.println(Arrays.toString(name1));
		
		String s1 = name.toUpperCase();
		System.out.println(s1);
		
		String s2 = name.toLowerCase();
		System.out.println(s2);
		
		int i = s2.length();
		System.out.println("Length of string is "+i);
	}
}
