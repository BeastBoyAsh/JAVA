import java.lang.Math;
import java.util.Scanner;

class MulRange{

    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range - " );
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("A is from "+a);
    System.out.println("B is till "+b);
    int i,s=1;
    for(i=a;i<=b;i++){
       s=s*i;
    }
    System.out.println("Its Mul is "+s);
} 
}