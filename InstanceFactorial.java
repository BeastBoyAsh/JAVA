import java.util.Scanner;
class InstanceFactorial{
    int a;
        public static void main(String[] args) 
    {
        int i,f=1;
        InstanceFactorial d1=new InstanceFactorial();
        System.out.println("Enter the number ");
        Scanner sc=new Scanner(System.in);
         d1.a=sc.nextInt();
        
        System.out.println("A is "+d1.a);
        for(i=d1.a;i>=1;i--)
        {
            f=f*i;
        }
        System.out.println("The factorial is "+f);

        
    }
}
