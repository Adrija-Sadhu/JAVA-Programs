// Input a number and check whether the digits in it are in ascending order
import java.util.Scanner;
public class Ordered {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		
		int a,flag=1,b=9;
		while(n!=0)
		{
			a=n%10;
			if(a>b)
			{
				flag=0;
				break;
			}
				b=a;
			n/=10;
		}
		if(flag==0)
			System.out.println("Not well ordered");
		else
			System.out.println("Well ordered");

            sc.close();
	}

}
