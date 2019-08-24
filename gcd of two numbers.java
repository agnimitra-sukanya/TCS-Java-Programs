import java.util.*;
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        int gcd=1;
        System.out.println("Enter two numbers:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            if(n1 % i==0 && n2 % i==0)
               gcd = i;
        }
        System.out.printf("G.C.D of %d and %d is %d", n1, n2,gcd);
    }
}
