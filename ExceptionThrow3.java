import java.util.Scanner;

class ExeptionThrow3{
    public void show(){
        Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number ");
      int a=sc.nextInt();
    
    if(a<0) throw new NumberFormatException();
    else if(a>0) throw new ArithmeticException();
    else throw new ArrayIndexOutOfBoundsException();
}
    public static void main(String[] args){
        
        ExeptionThrow3 m=new ExeptionThrow3();
        m.show();
    }
   }