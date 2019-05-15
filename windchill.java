import java.util.*;
import java.io.*;
import java.util.Scanner;
		

		public class windchill {


public static void main(String[] args) {

			Scanner num = new Scanner(System.in);
while(true){
			System.out.println("enter the value of temprature");
			double t = num.nextDouble();
			System.out.println("enter the value of speed");
			double v = num.nextDouble();
			
if(t<50 || v>120 || v<3 ) {
 double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
	System.out.println("Temperature = " + t);
        System.out.println("Wind speed  = " + v);
        System.out.println("Wind chill  = " + w);
}

else{

	System.out.println("Invalid data");
}

break;
}

}

}
