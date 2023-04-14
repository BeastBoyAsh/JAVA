import java.lang.Math;
import java.util.Scanner;

class Power5{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Value- " );
    int a=sc.nextInt();
    int i;
    double d;
    for(i=5;i>=1;i=i-1){
        d=Math.pow(a,i);
        System.out.println(d);
    }
} 
}