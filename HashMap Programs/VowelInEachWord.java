//Frequency of vowels in each word in a string
import java.util.*;
public class VowelInEachWord {
    public static void main(String[] args)
    {
        String str="Java is a high-level platform independent object-oriented programming language developed James Gosling";

        HashMap<Character,Integer> map=new HashMap<>();

        map.put('A',0);
        map.put('E',0);
        map.put('I',0);
        map.put('O',0);
        map.put('U',0);

        str=str.toUpperCase();
        
        String[] x=str.split(" ");
        
        for(String s:x)
        {
            for(char ch:s.toCharArray())
            {
                if(map.containsKey(ch))
                map.put(ch,map.get(ch)+1);
            }
            System.out.println(s+" : "+map);
        }
        
        
    }
    
}
