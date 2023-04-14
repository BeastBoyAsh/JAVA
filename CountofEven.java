import java.lang.Math;
import java.util.Scanner;

class CountofEven{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Range ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("A is from "+a);
    System.out.println("B is till "+b);
    int i,c=0;
    for(i=a;i<=b;i=i+1){
       {
           if(i%2==0){
            c=c+1;
           }
       }
       System.out.println("The Number of Even integer is  "+c);
}


    }
    
} 
