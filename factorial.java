import java.util.*;
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            factorial=factorial*i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
