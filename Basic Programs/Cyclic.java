//Generate all cyclic permutations of a given number
import java.util.*;
public class Cyclic {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        int n=num;
        int count=0;
        while(n!=0)
        {
            count++;
            n/=10;
        }

        System.out.println("Cyclic Permutations : ");

        for(int i=1;i<=count;i++)
        {
            System.out.println(num);
           int a=num/(int)Math.pow(10,count-1);
           num=num%(int)Math.pow(10,count-1)*10+a;
        }
        sc.close();
    }
}
