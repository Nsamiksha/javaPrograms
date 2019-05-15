import java.util.*;
import java.util.Scanner;
public class BubbleSort {
public static void main(String[] args)  {
Scanner n = new Scanner(System.in) ;
System.out.println("Enter the size of array");

	int a = n.nextInt();
	int[] arr = new int[a];

System.out.println("Enter the elements of array for sorting");
	for(int i = 0; i<arr.length; i++) {
 	arr[i] = n.nextInt();
	}
	//for printing the user array
	System.out.print("[");
	for(int i = 0; i<arr.length ; i++){
	System.out.print( arr[i] + "\t");  
	}
	System.out.print("]");
   	System.out.println();
	//sorted array
	sorting(arr);
	


}


	//method for sorting
 static void sorting(int[] arr) {
	int temp = 0;
	int a = arr.length;

	for(int i=0; i< a ; i++){  
     		 for(int j=0; j < a-i-1; j++){  
                 if(arr[j] > arr[j+1]){  
        	 temp = arr[j+1]; 	
		arr[j+1] = arr[j];  
                    arr[j] = temp;  
		}

		}
		}
        System.out.print("[");
	for(int i = 0; i<arr.length ; i++){
	System.out.print( arr[i] + "\t");  
	}
	System.out.print("]");
   	System.out.println();	


}


}


