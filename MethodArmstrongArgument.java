import java.util.Scanner;
class MethodArmstrongArgument{
    public void armstrong(int n){
    int c=0,a,z=0;
    c=n;
    while(c!=0)
    {
        a=c%10;
        z=z+a*a*a;
        c=c/10;
    }   
    if(z==n)
    {
        System.out.println("Its an Armstrong number "+n);
    }
    else
    System.out.println("Its Not an Armstrong number "+n);
    }

    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number ");
    int n=sc.nextInt();
    MethodArmstrongArgument b=new MethodArmstrongArgument();
    b.armstrong(n);
    }
}



