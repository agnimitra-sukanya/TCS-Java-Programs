import java.util.*;
import java.io.*;
import java.util.Scanner;
class Main {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year:");
        int year=sc.nextInt();
        boolean flag=false;
        if(year%400==0)
        {
            flag=true;
        }
        else if(year%100==0)
        {
            flag=false;
        }
        else if(year%4==0)
        {
            flag=true;
        }
        else
        {
            flag=false;
        }
        if(flag)
        {
            System.out.println("The year "+year+" is a leap year");
        }
        else
        {
           System.out.println("The year "+year+" is not a leap year"); 
        }
    }
}
