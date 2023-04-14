import java.util.Scanner;
class Reverse{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int b,z=0;
    System.out.println("Enter the number ");
    int n=sc.nextInt();
    System.out.println("Entered number is "+n);
    while(n!=0)
    {
        b=n%10;
        z=z*10+b;
        n=n/10;
    }
        System.out.println("The reverse is "+z);   
    }
 }

