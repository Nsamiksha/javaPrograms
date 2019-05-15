import java.util.Scanner;
import java.lang.Math;




		public class quadratic {

	public static void main(String[] args)  {


Scanner num = new Scanner(System.in);

	System.out.println("Enter the value of a");
	int a = num.nextInt();
	System.out.println("Enter the value of b");
	int b = num.nextInt();
	System.out.println("Enter the value of c");
	int c = num.nextInt();

		double y = Math.pow(b, 2);
		double delta = ( y - 4*a*c) ;

if (delta > 0.0) {
double z = Math.sqrt(delta);
double x = ( (-b + z )/(2*a) ) ;
double x1 = ( (-b - z )/(2*a) ) ;
System.out.println( "root1: " +x);
System.out.println("root2: " + x1);
}
		else if (delta == 0.0) {
                double r1 = -b / (2.0 * a);
                System.out.println("The root is " + r1);
                } 
                else {
                System.out.println("The equation has no real roots.");
                }


	


}


}
