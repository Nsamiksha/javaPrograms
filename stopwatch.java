import java.util.*;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;


public class stopwatch {



public static void main(String[] args) {


	Scanner num = new Scanner(System.in);
	System.out.println("press '1' for start ");
	int start = num.nextInt();
	long startTime = System.currentTimeMillis();

		System.out.println("press '0' for end");
		int end = num.nextInt();

		long endTime = System.currentTimeMillis();
	        long diff = endTime - startTime;


	System.out.println("time elapsed in milli : " + diff);
System.out.println("time elapsed in sec : " + diff/1000);

}
}
