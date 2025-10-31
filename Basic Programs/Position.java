/* Find position of a character in a given String */
import java.util.*;
public class Position{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String str;

        str=sc.next();

        char ch;
        ch=sc.next().charAt(0);

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                System.out.println(i);
                break;
            }
        }

        sc.close();
    }
}