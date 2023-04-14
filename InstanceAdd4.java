import java.util.Scanner;
class InstanceAdd4{
    int m,cm;
    
        public static void main(String[] args) 
    {
        
        InstanceAdd4 d1=new InstanceAdd4();
        InstanceAdd4 d2=new InstanceAdd4();
        InstanceAdd4 d3=new InstanceAdd4();
        InstanceAdd4 d4=new InstanceAdd4();

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length in both metre and cm ");
        
         d1.m=sc.nextInt();
         d1.cm=sc.nextInt();

        System.out.println(d1.m+" m ");
        System.out.println(d1.cm+" cm ");

       

        System.out.println("Enter the length in both metre and cm ");
        
         d2.m=sc.nextInt();
         d2.cm=sc.nextInt();

        System.out.println(d2.m+" m ");
        System.out.println(d2.cm+" cm ");

        d3.m=d1.m+d2.m;
        d3.cm=d1.cm+d2.cm;

        

        System.out.println(d3.m+" m "+d3.cm+" cm ");
        

        
    }
}
