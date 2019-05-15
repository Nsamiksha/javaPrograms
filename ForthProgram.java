import java.util.Scanner;  // Import the Scanner class
import java.lang.Math;

class ForthProgram {
  	
	public static void main(String[] args) {

System.out.println("enter the power value ");
while(true){
Scanner n = new Scanner(System.in);  // Create a Scanner object
int power = n.nextInt();  // Read user input
 	if(power<31){
for (int i = 0; i<=power; i++ ){
double s = Math.pow(2,i);
 int a = (int)s;
System.out.println("The power of 2 raised to power"+ i +"is   " + a);
}break;
}
	else{
System.out.println("enter number less than 31");
}
}
}
}
