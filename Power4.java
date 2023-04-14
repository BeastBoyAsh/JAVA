import java.lang.Math;
import java.util.Scanner;

class Power4{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Value- " );
    int a=sc.nextInt();
    int i;
    double d;
    for(i=1;i<=9;i=i+2){
        d=Math.pow(a,i);
        System.out.println(d);
    }
} 
}