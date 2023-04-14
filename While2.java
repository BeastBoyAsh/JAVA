import java.util.Scanner;
class While2{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int b,s=0;
    System.out.println("Enter the number ");
    int n=sc.nextInt();
    System.out.println("Entered number is "+n);
    while(n!=0)
    {
        b=n%10;
        s=s+b;
        n=n/10;
    }
    System.out.println("The sum is "+s);
    }
 }

