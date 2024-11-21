//Write a program to find if a given integer number is palindrome or not. 
package lab1;
import java.util.Scanner;
public class question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
        scanner.close();
    }
    private static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        int remainder;
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        return originalNum == reversedNum;
    }
}

