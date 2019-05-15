import java.util.Scanner;  // Import the Scanner class

class FirstProgram {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

while(true) {
   String userName = userInput.nextLine();  // Read user input
    int len = userName.length();
	
if (len>0 && len<3 ){
System.out.println("enter valid username with min three character");
}
else {
System.out.println(" Hello "  + userName + ", how are you?");  // Output user input 
break;
}
 }
} 
}
