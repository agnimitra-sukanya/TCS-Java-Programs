import java.util.*;
import java.io.*;
import java.util.Scanner;
class Main {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in the array:");
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
       int max=a[0];
       for(int i=0;i<n;i++)
       {
           if(max<a[i])
           {
               max=a[i];
           }
           
       }
       System.out.print("The largest number is:"+max);
    }
}

