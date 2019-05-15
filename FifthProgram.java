import java.io.*; 
import java.util.Scanner;  // Import the Scanner class

class FifthProgram{ 
  	public static void main(String[] args) {
   	 	System.out.println("Enter the harmonic value N");
while(true){
	Scanner n = new Scanner(System.in);  // Create a Scanner object
  	int s = n.nextInt();  // Read user input
  if(s>0){
float harmonic = 1; 
for (float i = 2; i <= s; i++) { 
        harmonic = harmonic + 1/i; 
}  
System.out.println("the " + s + "th harmonic value is " + harmonic);   
break;}  
  else{
System.out.println("Please enter harmonic value greater than zero") ;
}

}  
  

}
}
  
    
