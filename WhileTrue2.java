import java.util.Scanner;
class WhileTrue2{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int b,a=0;
    System.out.println("Enter the number ");
    

    while(true)
    {
        int n=sc.nextInt();
        {
            if(n==-1)
            {
                break;
            }
        }
        if(n>a)
        {
            a=n;
        }
    }
    System.out.println("The Max is "+a);
}

}
    