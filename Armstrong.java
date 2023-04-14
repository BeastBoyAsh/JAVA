import java.util.Scanner;
class Armstrong{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int b,s=0;
    System.out.println("Enter the number ");
    int n=sc.nextInt();
    System.out.println("Entered number is "+n);
    int z=0;
    z=n;
    while(n!=0)
    {
        b=n%10;
        s=s+b*b*b;
        n=n/10;
    }
    if(z==s)
        {
        System.out.println("Its an Armstrong number "+s); 
        }  
    else
    {
        System.out.println("Its Not an Armstrong number "+z); 
    }
    }
 }

