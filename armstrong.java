import java.util.*;
import java.io.*;
import java.util.Scanner;
class Main {
    public static void main(String args[])
    {
        int temp,num,rem,result=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        num=sc.nextInt();
        temp=num;
        while(temp>0)
        {
            rem=num%10;
            result=result+(rem*rem*rem);
            num=num/10;
        }
        if(result==temp)
        {
            System.out.print("The number is armstrong");
        }
        else
        {
            System.out.print("The number is not armstrong");
        }
    }
}
