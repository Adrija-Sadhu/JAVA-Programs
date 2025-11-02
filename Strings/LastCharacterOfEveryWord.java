/* Print the last character of every word in a given string.
 * Conditions: Ignore all the digits and whitespaces
 * Example:
 * Input: Hey3 Java Learners
 * Output: a s
 */
import java.util.*;
public class LastCharacterOfEveryWord {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String str;

        System.out.println("Enter a string : ");
        str=sc.nextLine();

        String[] x=str.split(" ");
        
        for(int i=0;i<x.length;i++){

            String word=x[i];

            char ch=word.charAt(word.length()-1);

            if(!Character.isDigit(ch))
            System.out.print(ch+" ");
        }
        

        sc.close();
    }
}
