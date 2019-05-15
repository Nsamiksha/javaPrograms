import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class array {

	public static void main(String[] args) {
Scanner num = new Scanner(System.in); 
System.out.println("enter the number of rows") ;
	int row = num.nextInt();
System.out.println("enter the number of coloums") ;
	int coloum = num.nextInt();
System.out.println("enter the array elements") ;

int[][] array = new int[row][coloum];

for(int i=0;i<row;i++){  
for(int j=0;j<coloum;j++){  
array[i][j] = num.nextInt();

}
 }	PrintWriter prnwrt = new PrintWriter(System.out, true);
     prnwrt.print("array elements are");
       prnwrt.println() ;
	for(int i=0;i<row;i++){  
	for(int j=0;j<coloum;j++){ 
	
	System.out.print(array[i][j] + "\t");

}      prnwrt.println() ;
}


}
}



















