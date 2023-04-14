import java.lang.Math;
import java.util.Scanner;

class Divisor{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Value  " );
    int a=sc.nextInt();
    int i;
    double x,y,z;
    for(i=1;i<=a/2;i=i+1){
       {
           if(a%i==0){
            System.out.println(i);
           }
       }
    }
} 
}