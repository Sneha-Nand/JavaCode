// print arrays

package core;

import java.util.Arrays;

public class Array1 {
	public static void main(String args[])
	{
		int rollno[] = new int[4];
		
		rollno[0]=11;
		rollno[1]=12;
		rollno[2]=13;
		rollno[3]=14;
		// rollno[4]=15;
		
//		for(int i=0;i<=3;i++)
//		{
//		System.out.println(rollno[i]);
//		}
		
		System.out.println(Arrays.toString(rollno));
	}

}