//Write a program for sorting a given list of names in ascending order.
package lab2;
import java.util.Arrays;
public class question3 {
    public static void main(String[] args) {
        String arr[]={"Thano","Mhan","Zhan","Ahan"};
        System.out.println("Before Sorting:");
        for (int i=0; i<4;i++){
            System.out.println(arr[i]);
        }
        //Array.sort is used for sorting in java(oops) which requies import before using it.
        Arrays.sort(arr);
        System.out.println("Sorted Data:");
            for(String name : arr) //String is used for storing the displaying new output of arr(variable).
            {
                   System.out.println(name);
            }
        }
    }
