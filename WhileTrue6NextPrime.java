import java.util.Scanner;
class WhileTrue6NextPrime{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int c=0,i,n,x=0;
    System.out.println("Enter the number ");

    while(true)
    {
        n=sc.nextInt();
        for(i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                c=c+1;
            }
        }

        if(c==1)
        {
            System.out.println("Prime is "+n);   
            break;
        }
        else
        {
            System.out.println("Not prime "+n);   
        }
        c=0;
    }

    while(true)
    {
         n=n+1;
         for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c=c+1;
            }
        }
        if(c==2)
        {
            System.out.println("Next Prime is "+n);   
            break;
        }
        c=0;
    }
   
}

}
    