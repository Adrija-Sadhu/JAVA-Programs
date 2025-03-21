/*
 * generates an array of 20 random integers between 10 and 99, then rearranges the array so that 
 * all even numbers appear before all odd numbers while preserving their relative order.
 */
import java.util.*;
public class EvenOddArrange {
    public static void arrange(int arr[])
    {
        int n=arr.length;
        int j=0,k=0;
        int b[]=new int[n];
        int c[]=new int[n];

        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            b[j++]=arr[i];
            else 
            c[k++]=arr[i];
        }

        for(int i=0;i<j;i++)
        {
            arr[i]=b[i];
        }
        for(int i=0;i<k;i++)
        {
            arr[j+i]=c[i];
        }
    }
    public static void main(String[] args)
    {
        Random r=new Random();

        int arr[]=new int[20];

        System.out.println("Enter the elements : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=r.nextInt(10,100);
        }
        arrange(arr);

        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
