package lab2;
public class question2 {
public static void main(String[] args)
{
    int arr[]={10,20,5,40};
    int max=arr[0];
    int min=arr[0];
    for(int i =0;i<4;i++)
    {
      if (min>arr[i])
      min=arr[i];
      if (max<arr[i])
      max=arr[i];
    }
System.out.println("Maximum:"+max);
System.out.println("Minimum:"+min);
}
}
