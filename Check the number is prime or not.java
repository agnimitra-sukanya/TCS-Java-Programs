import java.util.*;
import java.io.*;
import java.util.Scanner;
class Main {
public static void main(String[] args) {
    int n,i,res;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number:");
    n=sc.nextInt();
    for(i=2;i<=n;i++)
    {
        if(n%i==0)
        {
            System.out.print("Not prime");
            break;
        }
        else
        {
            System.out.print("Prime number");
            break;
        }
    }
}
}
