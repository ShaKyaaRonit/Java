//check wheather number is positive or negative or zero.
package ControlStatement;
import java.util.Scanner;
public class question1 {
public static void main(String[] args) {
    Scanner ann = new Scanner(System.in);
    int n ;
    System.out.println("enter a number:");
    n = ann.nextInt();
    if (n>0){
        System.out.println("Positive");
    }

    else if (n<0){
        System.out.println("Negative");
    }
    else 
    {
        System.out.println("Zero");
    }
ann.close();
}
}