import java.util.*;
import java.io.*;
import java.util.Scanner;
class Main {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first string:");
    String str1=sc.nextLine();
    System.out.println("Enter the second string:");
    String str2=sc.nextLine();
    String s=" ";
    s=str1+str2;
    System.out.print("The concatenated string:"+s);
}
}
