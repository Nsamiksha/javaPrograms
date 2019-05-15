import java.util.ArrayList;
import java.util.Scanner;

public class sumofarray { 
  public static void main(String[] args) { 

Scanner num = new Scanner(System.in);
System.out.println("Enter the size of array");
int n = num.nextInt();
int[] array = new int[n];
System.out.println("Enter the array element");

	for(int i = 0; i<n; i++) {
 	array[i] = num.nextInt();
	}
	System.out.print("[");
	for(int i = 0; i<n; i++){
	System.out.print( array[i] + "\t");  
	}
	System.out.print("]");
   	System.out.println();
     
	for(int i=0; i<array.length - 2; i++){
	for(int y=i+1; y<array.length - 1; y++){
	for(int z=y+1; z<array.length; z++){
  	
	int sum = array[i]+array[y]+array[z];
	
	while(sum == 0) {
	System.out.println("triplets are:\t"+array[i]+"\t"+ array[y]+"\t" + array[z]);
	break;
	}




	}}}

	
	}}
