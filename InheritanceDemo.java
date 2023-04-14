import java.util.Scanner;
class InheritanceDemo{
    
    protected int a;

    public void set(int x){
      a=x;
    }
  
    public void calculate(){
        if(a%2==0)
        {
        System.out.println("Its a even number  "+a);
        }
        else
        {
            System.out.println("Its an odd number  "+a);
        }

    }
}    

class InheritanceDemo2 extends InheritanceDemo{
    public void calculate(){
       super.calculate();
       int i,f=1;
       for(i=a;i>=1;i--)
       {
           f=f*i;
       }
        System.out.println("The factorial is "+f);
   }
}

class InheritanceDemo3 extends InheritanceDemo2{
    public void calculate(){
       super.calculate();
       int b,r=0;
       while(a!=0)
       {
           b=a%10;
           r=r*10+b;
           a=a/10;
       }
        System.out.println("The reverse is "+r);
   }
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    InheritanceDemo3 y=new InheritanceDemo3();
    System.out.println("Enter number - ");
    y.set(sc.nextInt());
    y.calculate();
   }
}











    
    
                  
