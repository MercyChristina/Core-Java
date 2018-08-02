//find the sum and average of 10 numbers

import java.util.Scanner;
public class sumavg{
    public static void main(String[] args) {
    int i,n;
    double S=0,A=0;
    System.out.println("enter the 10 numbers");
    Scanner sc=new Scanner(System.in);
    for(i=1;i<=10;i++)
    {
        n=sc.nextInt();
        S=S+n;
        
    }
    A=S/10;
    System.out.println("sum is"+S);
    System.out.println("average is"+A);
    
    }
    
}
