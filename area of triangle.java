import java.util.*;
import java.io.*;
import java.util.Scanner;
class Main {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base of triangle:");
        double base=sc.nextDouble();
        System.out.println("Enter height of triangle:");
        double height=sc.nextDouble();
        double a=area_triangle(base,height);
        System.out.print("Area of triangle is:"+a);
    }
    static double area_triangle(double b,double h)
    {
        return((b*h)/2);
    }
}
