package ControlStatement;
import java.util.Scanner;
public class question2loop {

    public static void main(String[] args) {
        int i,n;
        int sum =0;
        Scanner nnn = new Scanner(System.in);
        System.out.println("Enter n number:");
        n = nnn.nextInt();
        nnn.close();
        for(i=1;i<=n;i++){
        sum = sum + i;
        }
    System.out.println(sum);

    }
}