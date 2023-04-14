import java.lang.Math;
import java.util.Scanner;

class SumofDivisor{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Value  " );
    int a=sc.nextInt();
    int i,s=0;
    for(i=1;i<=a/2;i=i+1){
       {
           if(a%i==0){
            s=s+i;
           }
       }

    }
    System.out.println("The sum of Divisor is  "+s);
} 
}