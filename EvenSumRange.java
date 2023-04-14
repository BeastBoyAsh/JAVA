import java.lang.Math;
import java.util.Scanner;

class EvenSumRange{

    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range - " );
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("A is from "+a);
    System.out.println("B is till "+b);
    int i,s=0;
    for(i=a;i<=b;i++){
        if(i%2==0){
            s=s+i;
        }
        
    }
    System.out.println("Its Even Number Sum is  "+s);
} 
}