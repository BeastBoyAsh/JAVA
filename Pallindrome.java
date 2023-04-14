import java.util.Scanner;
class Pallindrome{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int b,z=0,s=0;
    System.out.println("Enter the number ");
    int n=sc.nextInt();
    System.out.println("Entered number is "+n);
    s=n;
    while(n!=0)
    {
        b=n%10;
        z=z*10+b;
        n=n/10;
    }
    if(z==s)
        {
        System.out.println("Its an Pallindrome number "+s); 
        }  
    else
    {
        System.out.println("Its Not an Pallindrome number "+s); 
    }
         
    }
 }


    
 

