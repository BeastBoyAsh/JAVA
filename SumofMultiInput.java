import java.lang.Math;
import java.util.Scanner;

class SumofMutiInput{
    public static void main(String[] args){
    int i,s=0;;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of inputs ");
    int n=sc.nextInt();

    System.out.println("Enter the numbers ");
    for(i=1;i<=n;i=i+1){
       {
        int a=sc.nextInt();
        {
            s=s+a;
        }
       }
    }
    System.out.println("The sum is "+s);
 }
    
} 
