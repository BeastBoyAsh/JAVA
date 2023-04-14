import java.util.Scanner;
class MethodPrimeArgument{
    public void prime(int a){   
    int i,c=0;
    for(i=1;i<=a;i++)
    {
        if(a%i==0)
        {
            c=c+1;
        }
    }
    if(c==2)
    {
        System.out.println("Its a Prime number "+a);
    }
    else
    System.out.println("Its Not a Prime number "+a);
    }

    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number ");
    int a=sc.nextInt();
    MethodPrimeArgument b=new MethodPrimeArgument();
    b.prime(a);
    }
}



