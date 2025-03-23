package Strings;
import java.util.*;
public class Anagram
{
    public static boolean check(String s1,String s2)
    {
        if(s1.length()!=s2.length())
        return false;

        s1=s1.toUpperCase();
        s2=s2.toUpperCase();
        int[] freq=new int[26];

        for(int i=0;i<s1.length();i++)
        {
            freq[s1.charAt(i)-'A']++;
        }
        for(int i=0;i<s2.length();i++)
        {
            freq[s2.charAt(i)-'A']--;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0)
              return false;
        }
         return true;   
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st strings : ");
        String s1=sc.nextLine();

        System.out.println("Enter 2nd string : ");
        String s2=sc.nextLine();

        boolean res=check(s1,s2);

        if(res==true)
        System.out.println(s1+" & "+s2+" are anagram");
        else
        System.out.println(s1+" & "+s2+" are not anagram");
        sc.close();

    }
}
