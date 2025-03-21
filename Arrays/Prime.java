// Generate first 100 prime numbers 
public class Prime {
    public static boolean isPrime(int n)
        {
            boolean flag=true;
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                flag=false;
            }
            return flag;
        }
        public static void main(String[] args)
        {
            int[] arr=new int[100];
    
            int j=2;
    
            for(int i=0;i<100;j++)
            {
                if(isPrime(j))
                arr[i++]=j;
            }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
