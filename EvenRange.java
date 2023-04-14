import java.lang.Math;
import java.util.Scanner;

class EvenRange{

    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range - " );
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("A is from "+a);
    System.out.println("B is till "+b);
    double d;
    int i;
    for(i=a;i<=b;i++){
        if(i%2==0){
            System.out.println("Its Even Number "+i);
        }
    }
} 
}