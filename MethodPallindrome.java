import java.util.Scanner;
class MethodPallindrome{
    public void pallindrome(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number ");
            int a=sc.nextInt();
            System.out.println("A is  "+a);
            int i,c=0,n,b;
            n=a;
            while(n!=0)
            {
                b=n%10;
                c=c*10+b;
                n=n/10;
            }
            if(c==a){
            System.out.println("The Number Pallindrome");
            }
            else
            System.out.println("The Number is Not Pallindrome ");
        
        } 

    public static void main(String[] args){
        MethodPallindrome a=new MethodPallindrome();
    a.pallindrome();
    }
}



