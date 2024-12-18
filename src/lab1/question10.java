package lab1;
import java.util.Scanner;
public class question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        scanner.close();
    }
    private static boolean isArmstrong(int num) {
        int sum = 0;
        int originalNum = num;
        while (num != 0) {
            int digit = num % 10; 
            sum += Math.pow(digit, 3); 
            num /= 10;
        }
        return sum == originalNum;
    }
}
