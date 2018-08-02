//sorting in ascending order
import java.util.Arrays;
import java.util.Scanner;

public class ascndor {
   public static void main(String[] args) {
    System.out.println("enter the numbers");
    int arr1[]=new int[10];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<10;i++){
    arr1[i]=sc.nextInt();
     }
      for(int i=0;i<10;i++){
          Arrays.sort(arr1);
       System.out.println(arr1[i]);
      }
}
}