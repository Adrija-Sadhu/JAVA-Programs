/* Count the number of Lower Case Alphabets in a given string */
import java.util.*;
public class NoOfLowerCaseLetters {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String str;
        System.out.println("Enter a string : ");
        str=sc.next();

        int count=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z')
            count++;
        }

        System.out.println("The number of lowercase aplhabets in "+ str + " = " + count);

        sc.close();
    }
}
