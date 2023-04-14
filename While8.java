import java.util.Scanner;
class While8{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int b,i,f=1,s=0,z;
    System.out.println("Enter the number ");
    int n=sc.nextInt();
    System.out.println("Entered number is "+n);
    z=n;
    while(n!=0)
    {
        b=n%10;
          for(i=b;i>=1;i--)
          { 
             f=f*i;
          }
        n=n/10;
        s=s+f;
        f=1;
    }
    if(s==z)
    {
        System.out.println("Its a strong number "+z);
    }
    else
    {
        System.out.println("Its not a strong number "+z);   
    }
    }
 }

