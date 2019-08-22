import java.util.*;
import java.io.*;
import java.util.Scanner;
class Main {
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the numbers to be swapped:");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int t;
            t=a;
            a=b;
            b=t;
            System.out.println("Numbers after swapping:"+a+","+b);
        }
    
    }
