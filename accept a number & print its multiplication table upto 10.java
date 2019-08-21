import java.util.*;
import java.io.*;
import java.util.Scanner;
class Main {
public static void main(String[] args) {
    int n,i,res;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number:");
    n=sc.nextInt();
    for(i=1;i<=10;i++)
    {
        res=n*i;
        System.out.println(n+"*"+i+"="+res);
    }
	}
}
