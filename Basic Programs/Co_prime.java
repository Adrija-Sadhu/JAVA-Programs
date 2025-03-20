//Check two numbers are co-prime or not
import java.util.*;
public class Co_prime {
    public static int co_prime(int a,int b)
{
    while(a>0 && b>0)
    {
        if(a>b)
            a=a%b;
        else
            b=b%a;
    }
    if(a==0)
    return b;

    return a;
}
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int result=co_prime(a,b);
        if(result==1)
        System.out.println(a+" & "+b+" are co-prime");
        else
        System.out.println(a+" & "+b+" are not co-prime");

        sc.close();
    }
}
