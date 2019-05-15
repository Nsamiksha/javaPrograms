import java.util.Scanner;
import java.io.*;
public class Gambler {

public static void main(String[] args){
Scanner stake = new Scanner(System.in);
System.out.println("Enter the value of stake");
int s = stake.nextInt();
System.out.println("Enter the value of Goal");
int g = stake.nextInt();
System.out.println("Enter the value of Trail");
int t = stake.nextInt();

	int bets = 0;        
        int wins = 0;    

       
        for (int n = 0; n < t; n++) {

         
       int cash = s;
            while (cash > 0 && cash < g) {
                bets++;
                if (Math.random() < 0.5) cash++;     
                else                     cash--;    
            }
            if (cash == g) wins++;              
        }

   
        System.out.println(wins + " wins of " + t);
        System.out.println("Percent of games won = " + 100.0 * wins / t);
        System.out.println("Avg # bets           = " + 1.0 * bets / t);
    }

}


