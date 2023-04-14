import java.util.Scanner;
class MethodAdd{
    public void add(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the numbers ");

    int a=sc.nextInt();
    int b=sc.nextInt();

    System.out.println("A is " +a);
    
    System.out.println("B is "+b);
    int c= a+b;
    System.out.println("The sum is "+c);
    }
    public static void main(String[] args){
    MethodAdd a=new MethodAdd();
    a.add();
    }
}



