/* Count number of spaces and character in a string
 * Eg: 
 * Input : Hi I am a student
 * Output: Spaces : 4
 *         Characters : 13
 */
import java.util.*;
class CountSpacesAndCharacters
{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String str;

        System.out.println("Enter a string : ");
        str=sc.nextLine();

        String[] x=str.split(" ");

        int c1=0,c2=0;

        int len1=x.length;
        int len2=str.length();

        c1=len1-1;
        c2=len2-c1;

        System.out.println("Spaces : "+c1+"\n"+"Characters : "+c2);

        sc.close();

    }
}
