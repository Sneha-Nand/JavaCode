// constructor overloading with 7 parameter
package core;

public class Pro8 {
	
	Pro8()
	{
		System.out.println("Constructor with no parameter");
	}
	Pro8(int a, double d, char c, String str, boolean b, short s, byte b1 )
	{
		System.out.println("Conructor with 7 paramaeters ");
		System.out.println("First parameter is :" +a);
		System.out.println("Second parameter is :" +d);
		System.out.println("Third parameter is :" +c);
		System.out.println("Fourth parameter is :"+str);
		System.out.println("Fifth parameter is :"+b);
		System.out.println("Sixth parameter is :"+s);
		System.out.println("Seventh parameter is :"+b1);
	}
	
	public static void main(String args[])
	{
		new Pro8();
		new Pro8 (90,4587,'s',"Sne",true,(short)50,(byte)10);
	}

}
