import java.util.Scanner;
class WhileTrue8NextArmstrong{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int b,s=0,l=0,x=0,a;
    System.out.println("Enter the number ");
    int n=sc.nextInt();
    System.out.println("Entered number is "+n);
    int z=0;
    s=n;
    while(s!=0)
    {
        b=s%10;
        z=z+b*b*b;
        s=s/10;
    }
    if(z==n)
        {
        System.out.println("Its an Armstrong number "+z); 
        }  
    else
    {
        System.out.println("Its Not an Armstrong number "+z); 
    }

    while(true)
    {
        n=n+1;
        l=n;
        while(l!=0)
        {
            a=l%10;
            x=x+a*a*a;
            l=l/10;
        }

        if(x==n)
        {
            System.out.println("Next Armstrong number "+x); 
            break;
        }
        x=0;
    }
    }
}