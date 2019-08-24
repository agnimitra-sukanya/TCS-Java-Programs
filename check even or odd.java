import java.util.*;
import java.io.*;
import java.util.Scanner;
class Main {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("Enter a number:");
    n=sc.nextInt();
    if(n==0)
    {
        System.out.print("The number is even");
    }
    else if(n%2==0)
    {
        System.out.println("The number is even");
    }
    else
    {
        System.out.print("The number is odd");
    }
}
}
