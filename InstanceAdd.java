import java.util.Scanner;
class InstanceAdd{
    int a,b;
    
        public static void main(String[] args) 
    {
        int c;
        InstanceAdd d1=new InstanceAdd();
        System.out.println("Enter the numbers ");
        Scanner sc=new Scanner(System.in);
         d1.a=sc.nextInt();
         d1.b=sc.nextInt();

        System.out.println("A is "+d1.a);
        System.out.println("B is "+d1.b);

         c=d1.a+d1.b;

        System.out.println("The sum is "+c);

        
    }
}
