//Write a program to find compound interest getting required inputs from a user.
package lab1;
import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the annual rate of interest (in percentage): ");
        double rate = sc.nextDouble();

        System.out.print("Enter the time (in years): ");
        int time = sc.nextInt();

        System.out.print("Enter the number of times interest is compounded per year: ");
        int n = sc.nextInt();

        question2 calculator = new question2(principal, rate, time, n);

        // Displaying the result
        calculator.displayResult();

        sc.close();
    }
    double principal;
    double rate;
    int time;
    int n;
    // Constructor to initialize the values
    question2(double principal, double rate, int time, int n) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
        this.n = n;
    }

    double CompoundInterest()
    {
        return principal * Math.pow(1 + (rate / 100) / n, n * time) - principal;
    }

 
    void displayResult() {
        double compoundInterest = CompoundInterest();
        System.out.printf("Compound Interest: %.2f\n", compoundInterest);
        System.out.printf("Total Amount: %.2f\n", principal + compoundInterest);
    }
}
