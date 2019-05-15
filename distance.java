   	

import java.util.Scanner;
import java.lang.Math;



	public class distance {

		public static void main(String[] args)  {


	Scanner num = new Scanner(System.in);
	System.out.println("enter the value of X");
	double x = num.nextDouble();
	System.out.println("enter the value of Y");
	double y = num.nextDouble();

		double x1 = Math.pow(x, 2);
		double y1 = Math.pow(y, 2);
		double dist = Math.sqrt(x1 + y1);


	
	System.out.println("Euclidean Distance = " + dist);

}

}
