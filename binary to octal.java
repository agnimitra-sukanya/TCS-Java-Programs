import java.util.*;
import java.io.*;
import java.util.Scanner;
public class Main
{
 public static void main(String args[])
 {
 int binnum,quot, i=1, j;
 int octnum[] = new int[100];
 Scanner sc = new Scanner(System.in);
		
 System.out.print("Enter Binary Number : ");
 binnum = sc.nextInt();
		
 quot = binnum;
		
 while(quot != 0)
 {
 octnum[i++] = quot%8;
 quot = quot/8;
 }
		
 System.out.print("Equivalent Octal Value of " +binnum+ " is :\n");
 for(j=i-1; j>0; j--)
 {
 System.out.print(octnum[j]);
 }
}
}
