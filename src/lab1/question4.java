package lab1;    
import java.util.Scanner;
public class question4 {
    public static void main(String[] args) {
        int a;
        int b; 
        Scanner acv = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        a = acv.nextInt(); 
        b = acv.nextInt();
        a = (a > b) ? a : b;  // storing greater variable in inital variable a 

        b = acv.nextInt(); // thid input taking in b to check greatest value which is a and replace greaterst in a again.
        a = (b > a) ? b : a;   

        System.out.println("The greatest number is: " + a);
        acv.close();
    }

}

