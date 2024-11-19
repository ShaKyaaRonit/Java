//Write a program to find simple interest getting input from the user for information of Principal, interest rate, time.
package lab1;
import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        float SI;
        int Principal;
        int Time;
        int Rate;
        Scanner abc = new Scanner(System.in);
        System.out.println("enter Principal:");
        Principal = abc.nextInt();
        System.out.println("enter Time:");
        Time = abc.nextInt();
        System.out.println("enter Rate:");
        Rate = abc.nextInt();
        SI=(Principal*Time*Rate)/100;
    System.out.println("Simple Interest:"+SI);
    }
}
