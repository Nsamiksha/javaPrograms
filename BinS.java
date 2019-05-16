import java.io.*;
import java.util.*;
import java.util.Arrays;

public class BinS { 
		 int binarySearch(int arr[], int l, int r, int x) 
			{ 
			if (r>=l) 
			{ 
			int mid = l + (r - l)/2; 

			if (arr[mid] == x) {
			return mid; }

			if (arr[mid] > x) {
			mid--;
			if(arr[mid] == x){
			return mid;}
			}
			//return binarySearch(arr, l, mid-1, x); }
			
			return binarySearch(arr,l, mid+1, x); 
			} 
			return -1; 
			}
public static void main(String[] args) { 
		BinarySearch ob = new BinarySearch(); 
		Scanner n = new Scanner(System.in) ;
	System.out.println("Enter the size of array");
	int a = n.nextInt();
	int[] arr = new int[a];

	System.out.println("Enter the elements of array for sorting");
	for(int i = 0; i<arr.length; i++) {
 	arr[i] = n.nextInt();
	}
	
	System.out.println("Enter the element for search");
	int x = n.nextInt();

	Arrays.sort(arr);

	int result = ob.binarySearch(arr,0,a-1,x); 
			if (result == -1) 
			System.out.println("Element not present"); 
			else
			System.out.println("Element found at index " + result); 
	} 
} 


