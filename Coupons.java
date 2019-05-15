import java.util.Scanner;
import java.io.*;

public class Coupons {

  
    public static int getCoupon(int n) {
       
System.out.println(Math.random() * n); 
 return (int) (Math.random() * n);
    }

  
    public static int collect(int n) {
        boolean[] isCollected = new boolean[n];  
        int count = 0;                         
        int distinct  = 0;                       

       
        while (distinct < n) {
            int value = getCoupon(n);            
            count++;                          
            if (!isCollected[value]) {           
                distinct++;
                isCollected[value] = true;
            }
        }
        return count;
    }
	public static void main(String[] args) {
        System.out.println("enter the number");
	Scanner num = new Scanner(System.in);
	int n = num.nextInt();
        int count = collect(n);
        System.out.println(count);
    } 
} 
