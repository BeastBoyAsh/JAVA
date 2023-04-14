import java.util.Scanner;
class MethodPrimev2{
    public void prime(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number ");
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("A is from "+a);
            System.out.println("B is till "+a);
            int i,c=0,j;
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

    public static void main(String[] args){
        MethodPrimev2 a=new MethodPrimev2();
    a.prime();
    }
}



