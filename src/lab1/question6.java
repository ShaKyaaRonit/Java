package lab1;

public class question6 
{
    public static void main(String[] args) 
    {
        int a = 1; 
        int b = 1; 
        int c;     
        System.out.print(a + " " + b); 
        for (int i = 1; i <= 4; i++) 
        { 
            c = a + b; 
            System.out.print(" " + c);
            a = b; 
            b = c; 
        }
    }
}
