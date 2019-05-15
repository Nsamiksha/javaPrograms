 import java.util.*;
import java.util.Scanner;






	public class InsertionSort {


		public static void main(String[] args)  {
    
//BubbleSort obj = new BubbleSort();
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


	//method for insertion sorting
 static void sorting(int[] arr) {
	
	int a = arr.length;

	for(int i=1; i< a ; i++){  
	int key = arr[i];
	int j = i-1;
	while(j>=0 && arr[j]>key){
	arr[j+1] = arr[j];
	j = j-1;
	}
	arr[j+1]=key;
     		   
		}

		
        System.out.print("[");
	for(int i = 0; i<arr.length ; i++){
	System.out.print( arr[i] + "\t");  
	}
	System.out.print("]");
   	System.out.println();	
}

}






