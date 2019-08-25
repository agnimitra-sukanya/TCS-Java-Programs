import java.util.*;
import java.io.*;
import java.util.Scanner;
class Main {
    public static void main(String args[])
    {
        int original,num,rem,result=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        num=sc.nextInt();
        original=num;
        while(original>0)
        {
            rem=original%10;
            result=result+(rem*rem*rem);
            original=original/10;
        }
        if(result==num)
        {
            System.out.print("The number is armstrong");
        }
        else
        {
            System.out.print("The number is not armstrong");
        }
    }
}
