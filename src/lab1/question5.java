package lab1;
import java.util.Scanner;
public class question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower range: ");
        int a = scanner.nextInt();
        System.out.print("Enter the upper range: ");
        int b = scanner.nextInt();
        System.out.println("Prime numbers between " + a + " and " + b + ":");
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
    private static boolean isPrime(int n) {
        if (n <= 1) return false; 
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false; 
        }
        return true;
    }
}
