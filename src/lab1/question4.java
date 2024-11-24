package lab1;    
import java.util.Scanner;
public class question4 {
        static int  a;
        static int  b;
        public static void main(String[] args) {
            Scanner avb= new Scanner(System.in);
            System.out.println("enter num");
            a= avb.nextInt();
            System.out.println("enter num");
            b= avb.nextInt();
            if (a<b)
            System.out.println("greater"+b);
            else{
                System.out.println("greater"+a);
            }
    
    if (a<b ){
            //third input
            System.out.println("third integer as well:");
            a = avb.nextInt();
    }
    else {
            //third input
            System.out.println("third integer as well:");
            b = avb.nextInt();
    } 
    if (a<b)
    System.out.println("greater"+b);
    else{
        System.out.println("greater"+a);
    }
    
            avb.close();
        }
    }
    

