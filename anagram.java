import java.io.*;
import java.util.*;
import java.util.Arrays;






	public class anagram {


	public static void main(String[] args)  {



			Scanner num = new Scanner(System.in);
			System.out.println("enter string 1 ");
			String l = num.nextLine();
			System.out.println("enter string 2");
			String k = num.nextLine();

	char[] str1 = l.toCharArray();
	char[] str2 = k.toCharArray();

	Arrays.sort(str1);
	Arrays.sort(str2);
	System.out.println("sorted string 1:");

	for(int i = 0; i<str1.length; i++){
  	System.out.print(str1[i]);	
	}

	System.out.println("\n");
	System.out.println("sorted string 2:");
	for(int j = 0; j<str2.length; j++){
  	System.out.print(str2[j]);	
	}
				System.out.println("\n");
				boolean chk = Arrays.equals(str1,str2);
				//System.out.println(chk);

				if(chk == true){
				System.out.println("strings are anagram");
				}
				else{
				System.out.println("strings are not anagram");
				}







}

}
			
