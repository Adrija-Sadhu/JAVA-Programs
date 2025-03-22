//Remove Duplicate elements from an integer array using HashMap
import java.util.*;
public class RemoveDuplicates {

    public static void main(String[] args)
    {
        int[] arr={10,20,20,21,25,26,28,28,28};

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i:arr)
        {
            if(!map.containsKey(i))
            {
                map.put(i,1);
                System.out.print(i+" ");
            }
        }
    }
}
