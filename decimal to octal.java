import java.util.*;
import java.io.*;
import java.util.Scanner;
class Main {
    public static String decimaltoOctal(int num){    
    int rem; 
    String octal="";   
    char octalchars[]={'0','1','2','3','4','5','6','7'};  
    while(num>0)  
    {  
       rem=num%8;   
       octal=octalchars[rem]+octal;   
       num=num/8;  
    }  
    return octal;  
}    
public static void main(String args[]){ 
Scanner sc=new Scanner(System.in);
int num;
System.out.print("Enter a decimal number:");
num=sc.nextInt();
System.out.print("octal number is:"+decimaltoOctal(num));  
}
}      
