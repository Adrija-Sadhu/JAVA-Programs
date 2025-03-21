// Find frequency of each vowel in a String
import java.util.*;
public class VowelFrequency {
    public static void main(String[] args)
    {
        HashMap<Character,Integer> map=new HashMap<>();

        String str="Java is a high-level platform independednt object oriented programming language designed by James Gosling";
        str=str.toUpperCase();

        map.put('A',0);
        map.put('E',0);
        map.put('I',0);
        map.put('O',0);
        map.put('U',0);

        char[] ch=str.toCharArray();
        for(char c:ch)
        {
            if(map.containsKey(c))
            map.put(c,map.get(c)+1);
        }
        System.out.println(map);
    }
    
}
