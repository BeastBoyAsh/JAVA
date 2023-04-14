import java.util.Scanner;
class While6{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int b=0,x,z;
    System.out.println("Enter the number ");
    int n=sc.nextInt();
    System.out.println("Entered number is "+n);
    z=n;
    while(n!=0)
    {
        b=n%10;
        n=n/10;
    }
    x=b+(z%10);
    System.out.println("The Sum of first and last digit is "+x);
    }
 }

