//even numbers
import java.util.Scanner;
class even{
    public static void main(String[]args){
        int n,i;
        int a[]=new int[20];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nimbers");
        for(i=0;i<=20;i++){
            n=sc.nextInt();
            if(n%2==0)
            {
                a[i]=n; 
            }
            else{
                System.out.println("");
            }
       
            }
    System.out.println(a[i]);
 }}
