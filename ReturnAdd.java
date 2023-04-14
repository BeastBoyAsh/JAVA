import java.util.Scanner;
class ReturnAdd{
    int add(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number ");
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("A is "+a);
            System.out.println("B is "+b);
            int c=a+b;
            return c;
    }
    public static void main(String[] args) 
    {
        ReturnAdd a=new ReturnAdd();
        System.out.println("The Sum is "+a.add());
    }
}