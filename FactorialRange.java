import java.lang.Math;
import java.util.Scanner;

class FactorialRange{

    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number - " );
    int a=sc.nextInt();
    System.out.println("A is "+a);
    int i,s=1;
    for(i=a;i>=1;i--){
       s=s*i;
    }
    System.out.println("Its Factorial is "+s);
} 
}