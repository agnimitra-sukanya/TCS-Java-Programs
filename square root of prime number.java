import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.lang.Math;
class Main {
public static void main(String[] args) {
    int n,i;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number:");
    n=sc.nextInt();
    for(i=2;i<=n;i++)
    {
        if(n==2)
        {
            System.out.print("The square root of prime number is:"+Math.sqrt(n));
            break;
        }
        else if(n%i==0)
        {
            System.out.print("Not a Prime number");
            break;
        }
        else
        {
            System.out.print("The square root of prime number is:"+Math.sqrt(n));
            break;
        }
    }
}
}
