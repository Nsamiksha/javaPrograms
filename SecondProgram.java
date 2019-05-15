import java.util.Scanner;  // Import the Scanner class
import java.lang.Math;

class SecondProgram {
  public static void main(String[] args) {
 System.out.println("Enter no of coins to be tossed");
while(true){
    Scanner n = new Scanner(System.in);  // Create a Scanner object
    
	int s = n.nextInt();  // Read user input
if(s>0){
double headProbability = Math.pow(0.5, s);
double tailProbability = 1- headProbability; 
System.out.println(headProbability);
System.out.println("head% =" + headProbability*100);
System.out.println(tailProbability);
	if (Math.random() > 0.5){
	System.out.println("Heads");
	}
	else{
	System.out.println("Tails");
	}
break;
}
else{
System.out.println("please enter positive number");
}
}
}
}
  


