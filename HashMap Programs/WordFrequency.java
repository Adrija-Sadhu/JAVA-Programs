import java.util.*;

public class WordFrequency {
    public static void main(String[] args)
    {
        HashMap<String,Integer> map=new HashMap<>();
        String str="Java is a high-level platform independednt object oriented programming language designed by James Gosling";

        String x[]=str.split(" ");

        for(String s1:x)
        {
            if(map.containsKey(s1))
            map.put(s1,map.get(s1)+1);

            else
            map.put(s1,1);
        }

        System.out.println(map);
    }
}
