// Input a number and find its factorial
import java.util.*;
public class Factorial {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        int n=num;
        int factorial=1;
        while(n!=0)
        {
            factorial*=n;
            n--;
        }
        System.out.println("Factorial of "+num+" = "+factorial);

        sc.close();
    }
}
