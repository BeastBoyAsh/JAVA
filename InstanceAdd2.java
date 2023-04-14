import java.util.Scanner;
class InstanceAdd2{
    int a,b;
    
        public static void main(String[] args) 
    {
        
        InstanceAdd2 d1=new InstanceAdd2();
        InstanceAdd2 d2=new InstanceAdd2();
        InstanceAdd2 d3=new InstanceAdd2();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers for d1 ");
        
         d1.a=sc.nextInt();
         d1.b=sc.nextInt();

        System.out.println("A is for d1 "+d1.a);
        System.out.println("B is for d1 "+d1.b);

       

        System.out.println("Enter the numbers for d2 ");
        
         d2.a=sc.nextInt();
         d2.b=sc.nextInt();

        System.out.println("A is for d2 "+d2.a);
        System.out.println("B is for d2 "+d2.b);

        d3.a=d1.a+d2.a;
        d3.b=d1.b+d2.b;

        System.out.println(d3.a+" "+d3.b);

        
    }
}
