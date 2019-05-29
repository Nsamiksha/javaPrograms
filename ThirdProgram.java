import java.util.Scanner;  // Import the Scanner class
import java.lang.Math;

class ThirdProgram {
  	
	public static void main(String[] args) {
System.out.println("Enter year in 4 digit");
Scanner n = new Scanner(System.in);  // Create a Scanner object
int year = n.nextInt();  // Read user input
	
	
	if (year%4 == 0) && (year%100 != 0) || (year%400 == 0){	
        System.out.print(year + " is leap year" );
	}

	else
	{
	System.out.print(year + " is not a leap year" );
	}

}

}

