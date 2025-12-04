// final variable  - any variable that is final / cannot change update its value is final variable 
// Area of a circle - Pi *r*r
// final keyword - 
// Final keyword can be used with a variable- any variable that is final cannot change its value
// Final keyword can be used with a method - any method that is final cannot be overidden or suppressed 
// Final keyword can be used with class - any class that is final cannot be inherited 
package pack04122025;

public class Pro49 {

	final static double  pi  = 3.14;
	
	public static void main(String[] args) {
		int r = 10;
		
		double a = pi*r*r;
		
		System.out.println("Area is " + a);
	}
}
