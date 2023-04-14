import java.util.Scanner;
class InstanceGreatest{
    int a,b,c;
    
        public static void main(String[] args) 
    {
        InstanceGreatest d1=new InstanceGreatest();
        System.out.println("Enter the numbers ");
        Scanner sc=new Scanner(System.in);
         d1.a=sc.nextInt();
         d1.b=sc.nextInt();
         d1.c=sc.nextInt();

        System.out.println("A is "+d1.a);
        System.out.println("B is "+d1.b);
        System.out.println("C is "+d1.c);

        

if(d1.a>d1.b && d1.a>d1.c)
{
System.out.println(" A is greater");
}
else
if(d1.b>d1.a && d1.b>d1.c)
{
System.out.println(" B is greater");
}
else
if(d1.c>d1.a && d1.c>d1.b)
{
System.out.println(" C is greater");

        
    }
}
}