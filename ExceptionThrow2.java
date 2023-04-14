import java.util.Scanner;

class ExeptionThrow2{
    public void show(){
        Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number ");
      int a=sc.nextInt();
    
    if(a<0){
        throw new NumberFormatException();
    }
    else 
    if(a>0)
    {
        throw new ArithmeticException();
    }
}
    public static void main(String[] args){
        
        ExeptionThrow2 m=new ExeptionThrow2();
        m.show();
    }
   }