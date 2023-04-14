import java.util.Scanner;
class WhileTrue{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int b,s=0;
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
        s=s+n;
    }
    System.out.println("The sum is "+s);
}

}
    