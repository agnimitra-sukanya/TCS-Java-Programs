import java.util.*;
import java.io.*; 
import java.util.Scanner; 
class Main
{ 
    public static int binarytoDecimal(int num){  
    int decimal=0;  
    int x=0;  
    while(true){  
      if(num==0) {  
        break;  
      } else {  
          int temp = num%10;  
          decimal+=temp*Math.pow(2,x);  
          num=num/10;  
          x++;  
       }  
    }  
    return decimal;  
}  
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num;
System.out.println("Enter the binary number:");
num=sc.nextInt();
System.out.printf("Decimal of %d is:%d",num,binarytoDecimal(num));
}
}    
