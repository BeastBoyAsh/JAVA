import java.util.Scanner;
class MethodArmstrong{
    public void armstrong(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number ");
            int a=sc.nextInt();
            System.out.println("A is  "+a);
            int i,c=0,n,b;
            n=a;
            while(n!=0)
            {
                b=n%10;
                c=c+b*b*b;
                n=n/10;
            }
            if(c==a){
            System.out.println("The Number Armstrong");
            }
            else
            System.out.println("The Number is Not Armstrong");
        
        } 

    public static void main(String[] args){
    MethodArmstrong a=new MethodArmstrong();
    a.armstrong();
    }
}



