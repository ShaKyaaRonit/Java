//Write a program to find the roots of a quadratic equation.
package lab1;
import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking coefficients input
        System.out.print("Enter the coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter the coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter the constant c: ");
        double c = sc.nextDouble();
        // Ensuring it's a quadratic equation
        if (a == 0) {
            System.out.println("This is not a quadratic equation (a cannot be 0).");
        } else {
            QuadraticEquation equation = new QuadraticEquation(a, b, c);
            equation.findRoots();
        }
        sc.close();
    }
}
class QuadraticEquation {
    double a, b, c;
    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    void findRoots() {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and distinct:");
            System.out.printf("Root 1 = %.2f\n", root1);
            System.out.printf("Root 2 = %.2f\n", root2);
        } 
        else if (discriminant == 0) 
        {
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal:");
            System.out.printf("Root = %.2f\n", root);
        } else 
        {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are complex and imaginary:");
            System.out.printf("Root 1 = %.2f + %.2fi\n", realPart, imaginaryPart);
            System.out.printf("Root 2 = %.2f - %.2fi\n", realPart, imaginaryPart);
        }
    }
}




