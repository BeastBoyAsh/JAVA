import java.util.Scanner;
class WhileTrue4Asc{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int p=0,c=0;
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
        if(p>n)
        {
            c=c+1;
        }
      p=n;
    }
    if(c==0)
    {
        System.out.println("Ascending ");   
    }
    else
    {
        System.out.println("Not ascending ");   
    }
    
}

}
    