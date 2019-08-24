import java.util.*;
import java.io.*;
import java.util.Scanner;
class Main {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle:");
        double rad=sc.nextDouble();
        double a=area_circle(rad);
        System.out.print("Area of circle is:"+a);
    }
    static double area_circle(double r)
    {
        return(3.14*r*r);
    }
}
