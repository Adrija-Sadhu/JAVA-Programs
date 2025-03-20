import java.util.Random;

public class Merge {

	public static void sort(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[i])
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
	}
	public static void merge(int a[],int b[],int c[])
	{
		int n=a.length;
		int m=b.length;
		
		int i=0,j=0,k=0;
		
		while(i<n && j<m)
		{
			if(a[i]<b[j])
				c[k++]=a[i++];
			else
				c[k++]=b[j++];
		}
		while(i<n)
		{
			c[k++]=a[i++];
		}
		while(j<m)
		{
			c[k++]=b[j++];
		}
			
	}
	public static void main(String[] args) {
		Random r=new Random();
		int[] arr1=new int[20];
		int[] arr2=new int[15];
		int arr3[]=new int[35];
		System.out.println("Enter the elements : ");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=r.nextInt(10, 100);
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=r.nextInt(10, 100);
		}
		for(int x:arr1) {
			System.out.print(x+" ");
		}
		sort(arr1);
		sort(arr2);
		System.out.println("\nAfter sorting : "+"\narray 1 : ");
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i]+" ");
		System.out.print("\narray 2 : "+" ");
		for(int i=0;i<arr2.length;i++)
			System.out.print(arr2[i]+" ");
		merge(arr1,arr2,arr3);
		System.out.print("\narray 3 : "+" ");
		for(int i=0;i<arr3.length;i++)
			System.out.print(arr3[i]+" ");
	}

}
