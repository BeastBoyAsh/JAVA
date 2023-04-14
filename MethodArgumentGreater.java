import java.util.Scanner;
class MethodArgumentGreater{
    public void greater(int a,int b,int c){

System.out.println(" a is =  " +a);
System.out.println(" b is =  " +b);
System.out.println(" c is =  " +c);

if(a>b && a>c)
{
System.out.println(" a is greater");
}

if(b>a && b>c)
{
System.out.println(" b is greater");
}
if(c>a && c>b)
{
System.out.println(" c is greater");
}
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers ");

    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
        MethodArgumentGreater d=new MethodArgumentGreater();
        d.greater(a,b,c);
        }
    }
    

