//Write a program to compute the sum of all elements in an array.
package lab2;
public class question1 {
public static void main(String[] args) {
    int arr[]= {1,2,3};
    int sum=0;
    for(int i=0;i<3;i++)
    {
      sum = sum + arr[i];
    }
    System.out.println(+sum);
}

    
}