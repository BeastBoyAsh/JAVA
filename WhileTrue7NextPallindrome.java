import java.util.Scanner;
class WhileTrue7NextPallindrome{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int b,z=0,s=0,x=0,l=0,a,i,c=0,p=0;
    System.out.println("Enter the number ");
    int n=sc.nextInt();
    s=n;
    while(s!=0)
    {
        b=s%10;
        z=z*10+b;
        s=s/10;
    }
    if(z==n)
        {
        System.out.println("Its an Pallindrome number "+n); 
        }  
    else
    {
        System.out.println("Its Not an Pallindrome number "+n); 
    }

   
    while(true)
    {
        n=n+1;
        l=n;
        
        while(l!=0)
        {
        a=l%10;
        x=x*10+a;
        l=l/10;
        }

        if(x==n)
        {
              System.out.println("Next Pallindrome is "+x);   
              break;
        }
       x=0;
    }

    }
 }
