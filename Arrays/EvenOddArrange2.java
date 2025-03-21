import java.util.*;
public class EvenOddArrange2 {
    public static void arrange(int arr[])
    {
        int n=arr.length;
        int index=0;

        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                index++;
            }
        }
    }
    public static void main(String[] args)
    {
        Random r=new Random();

        int arr[]=new int[20];

        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=r.nextInt(10,100);
        }
        System.out.println("\nBefore arranging : ");
        for(int i:arr)
        {
            System.out.print(i+" ");
        }

        arrange(arr);

        System.out.println("\nAfter arranging : ");
        for(int i:arr)
        {
            System.out.print(i+" ");
        }

    }
}
