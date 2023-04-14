import java.util.Scanner;
class MethodOverloadingv2{
    void number(int x)
    {
        int i,c=0;
        for(i=1;i<=x;i=i+1){
            {
                if(x%i==0){
                 c=c+1;
                }
            }
         }
         if(c==2){
         System.out.println("The Number is Prime integer "+x);
         }
         else
         System.out.println("The Number is NonPrime integer "+x);
    }
    void number(int a,int b)
    {
        int i,j,c=0;
        System.out.println("A is from "+a);
    System.out.println("B is till "+b);
    for(i=a;i<=b;i=i+1)
    {
        for(j=1;j<=i;j=j+1)
        {
           if(i%j==0)
           {
               c=c+1;
           }
        }
        if(c==2)
        {
            System.out.println("The prime numbers in range is "+i);
        }
        c=0;
    }
    }
    void number(int c,int d)
    {
        int e=0,i,j,s=0;
        System.out.println("A is from "+c);
    System.out.println("B is till "+d);
    for(i=c;i<=d;i=i+1)
    {
        for(j=1;j<=i;j=j+1)
        {
           if(i%j==0)
           {
               e=e+1;
           }
        }
        if(e==2)
        {
            s=s+i;
        }
        e=0;
    }
    System.out.println("The sum of prime numbers in the given range is" +s);
    }
    void number(int n)
    {
        int i,c=0;
        System.out.println("Enter the number ");

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
    public static void main(String[] args) {
        MethodOverloadingv2 s=new MethodOverloadingv2();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for Prime number ");
        s.number(sc.nextInt());
        System.out.println("Enter the range for Prime no. in b/w ");
        s.number(sc.nextInt(),sc.nextInt());
        System.out.println("Enter the number for sum of Prime in range ");
        s.number(sc.nextInt(),sc.nextInt());
        System.out.println("Enter the number for next Prime ");
        s.number(sc.nextInt());
}
}