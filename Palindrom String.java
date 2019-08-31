import java.util.*;
import java.io.*;
import java.util.Scanner;
class Main {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String rev="";
        System.out.println("Enter a string:");
        String original=sc.nextLine();
        int leng=original.length();
        for(int i=leng-1;i>=0;i--)
        {
            rev=rev+original.charAt(i);
        }
        if(original.equals(rev))
        {
            System.out.print("Palindrome String");
        }
        else
        {
            System.out.print("Non Palindrome string");
        }
    }
}
