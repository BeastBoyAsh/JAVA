import java.lang.Math;
import java.util.Scanner;

class MaxMutiInput{
    public static void main(String[] args){
    int i,c=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of inputs ");
    int n=sc.nextInt();

    System.out.println("Enter the numbers ");
    for(i=1;i<=n;i=i+1){
       {
        int a=sc.nextInt();
         {
              if(a>c)
               {
                   c=a;
               }
         }
       }        
     }
     System.out.println("Maximum number is "+c);
    }
} 
