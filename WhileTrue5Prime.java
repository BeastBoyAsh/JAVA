import java.util.Scanner;
class WhileTrue5Prime{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int p=0,c=0,i;
    System.out.println("Enter the number ");

    while(true)
    {
        int n=sc.nextInt();
        for(i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                c=c+1;
            }
        }
    
        if(c==1)
        {
            System.out.println("Prime is "+n);   
            break;
        }
        c=0;
    }
   
    
}

}
    