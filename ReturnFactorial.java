import java.util.Scanner;
class ReturnFactorial{
    int factorial(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number ");
            int a=sc.nextInt();
    
            System.out.println("A is "+a);
            
            int i,f=1;
            for(i=a;i>=1;i--)
            {
                f=f*i;
            }
            return f;
    }
    public static void main(String[] args) 
    {
        ReturnFactorial a=new ReturnFactorial();
        System.out.println("The Factoril is "+a.factorial());
    }
}