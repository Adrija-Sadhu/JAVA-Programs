/*Write a Java program to remove all duplicate characters from a
 given string while preserving the order of their first occurrence. */
import java.util.*;
class RemoveDuplicates{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String str;
        System.out.println("Enter a string : ");
        str=sc.nextLine();

        String temp="";

        for(int i=0;i<str.length();i++){
            if(temp.indexOf(str.charAt(i))==-1)
            temp=temp+str.charAt(i);
        }

        System.out.println("String after removing duplicates : "+temp);

        sc.close();
    }
}