import java.lang.Math;
import java.util.Scanner;

class Power6{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Value Numerator- " );
    int a=sc.nextInt();
    System.out.println("Enter the Value Denominator- " );
    int b=sc.nextInt();
    int i;
    double x,y,z;
    for(i=1;i<=4;i=i+1){
        x=Math.pow(a,i);
        y=Math.pow(b,i);
        z=x/y;
        System.out.println(z);
    }
} 
}