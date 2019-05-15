import java.util.*;
import java.util.Scanner;


class permutation
{
	
	private static void swap(char[] ch, int i, int j)
	{
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}
	private static void permutations(char[] ch, int currentIndex)
	{
		if (currentIndex == ch.length - 1) {
			System.out.println(String.valueOf(ch));
		}

		for (int i = currentIndex; i < ch.length; i++)
		{
			swap(ch, currentIndex, i);
			permutations(ch, currentIndex + 1);
			swap(ch, currentIndex, i);
		}
	}

	public static void main(String[] args)
	{
		Scanner num = new Scanner(System.in);
		System.out.println("enter a String");
   		String s = num.nextLine();
		permutations(s.toCharArray(), 0);
	}
}

