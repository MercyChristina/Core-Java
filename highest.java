//Display highest marks and name 
import java.util.*;
class highest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int m[]=new int[10];
String n[]=new String[10];
for(int i=0;i<=2;i++)
{
m[i]=sc.nextInt();
n[i]=sc.nextLine();
System.out.println("enter name and marks");

}
for(int i=0;i<=2;i++)
{
for(int j=i+1;j<=2;j++)
{

if (m[i]>m[j])
{
int a=m[i];
System.out.println("highest is:"+n[i]);
}
}
}
}
}
