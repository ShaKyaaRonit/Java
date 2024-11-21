//Write a program to find the factorial of a number.
package lab1;
import java.util.Scanner;
public class question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int factorial = findFactorial(num);
        System.out.println("The factorial of " + num + " is: " + factorial);
        scanner.close();
    }
    private static int findFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
