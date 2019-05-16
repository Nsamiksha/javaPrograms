import java.util.*;
import java.util.Scanner;
public class InsertionSortString {
	public static void main(String[] args)  {
		Scanner num = new Scanner(System.in);
		System.out.println("enter string 1 ");
		String l = num.nextLine();
		int n = l.length();
		int[] array = new int[n];

	for(int i = 0; i<n; i++){
	array[i] = l.codePointAt(i);
	}
	sorting(array);
	}

static void sorting(int[] array) {
int temp = 0;
int a = array.length;
	for(int i=1; i< a ; i++){  
	int key = array[i];
	int j = i-1;
	while(j>=0 && array[j]>key){
	array[j+1] = array[j];
	j = j-1;
	}
	array[j+1]=key;
     		   
		}
    
	String str =null;
        for(int i: array){
	str = Character.toString((char)i);
	System.out.print(str);
	
}System.out.println();
	
}
}
