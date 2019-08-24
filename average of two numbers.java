import java.util.*;
import java.io.*;
import java.util.Scanner;
class Main {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float n1,n2;
        float avg;
        System.out.println("Enter the two numbers:");
        n1=sc.nextFloat();
        n2=sc.nextFloat();
        avg=(n1+n2)/2;
        System.out.print("The average of two numbers:"+avg);
    }
}
