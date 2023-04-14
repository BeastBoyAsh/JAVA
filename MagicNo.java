import java.util.Scanner;
class MagicNo{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int b,z=0,s=0,k=0,m;
    System.out.println("Enter the number ");
    int n=sc.nextInt();
    System.out.println("Entered number is "+n);
    s=n;
    
    while(n!=0)
    {
        b=n%10;
        k=k+b;
        n=n/10;
    }
    System.out.println("The sum is "+k);
    int l=k;

    while(k!=0)
    {
        b=k%10;
        z=z*10+b;
        k=k/10;
    }
    System.out.println("The reverse of sum is "+z);

    m=z*l;
    System.out.println("Its Mul is number "+m); 

    if(m==s)
        {
        System.out.println("Its an Magic number "+s); 
        }  
    else
    {
        System.out.println("Its Not an Magic number "+s); 
    }
         
    }
 }


    
 

