import java.lang.Math;
import java.util.Scanner;

class CountofDivisor{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Value  " );
    int a=sc.nextInt();
    int i,c=0;
    for(i=1;i<=a/2;i=i+1){
       {
           if(a%i==0){
            c=c+1;
           }
       }

    }
    System.out.println("The Number of Divisor is  "+c);
} 
}