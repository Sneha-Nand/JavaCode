package core;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of students");
		int size = sc.nextInt();
		
		int rollno[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the number of students at index " +i);
			rollno[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
	}
}
