import java.util.*;
import java.io.*; 
import java.util.Scanner; 
class Main
{ 
    public static void dectoBin(int num){    
     int binary[] = new int[40];    
     int i = 0;    
     while(num > 0){    
       binary[i++] = num%2;    
       num = num/2;    
     }    
     for(int j= i-1;j >= 0;j--){    
       System.out.print(binary[j]);    
     }    
System.out.println();
}    
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num;
System.out.println("Enter the decimal number:");
num=sc.nextInt();
System.out.printf("binary of %d is: ",num);  
dectoBin(num);    
}
}      
