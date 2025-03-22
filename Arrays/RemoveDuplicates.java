//Remove Duplicates from an array using Two-pointer approach
public class RemoveDuplicates {
    public static int removeDuplicates(int arr[])
    {
        int i=0;
        for(int j=1;j<arr.length;j++)
        {
            if(arr[i]!=arr[j])
            {
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args)
    {
        int arr[]={10,20,20,20,30,89,41,30,20};

        int k=removeDuplicates(arr);

        for(int i=0;i<k;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
