import java.util.*;
import java.io.*;
import java.util.Scanner;
class Main {
    public static void main(String args[])
    {
    int num,rev=0,digit;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    num=sc.nextInt();
    while(num!=0)
    {
        digit=num%10;
        rev=rev*10+digit;
        num=num/10;
    }
    System.out.print("The number after reversing is:"+rev);
}
}
