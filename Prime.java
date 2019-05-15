import java.io.*; 
import java.util.Scanner;  // Import the Scanner class

class Prime{ 
  	public static void main(String[] args) {
   	 	System.out.println("Enter Number");
Scanner n = new Scanner(System.in);  // Create a Scanner object
  	int s = n.nextInt();  // Read user input

	for(int i=2 ; i<s ; i++){

	
while(s%i == 0){
System.out.println(i);
s = s/i;+
}


}
}
}
