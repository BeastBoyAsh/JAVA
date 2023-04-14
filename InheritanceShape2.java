import java.util.Scanner;
class InheritancShape2{
    
    private int a;

    public void set(int x){
      a=x;
    }
    public int getass(){
        return a;
    }
}    

class InheritanceCircle2 extends InheritancShape2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        InheritanceCircle2 y=new InheritanceCircle2();
        
System.out.println("Enter - ");
        y.set(sc.nextInt());
        System.out.println("Area of circle is "+(3.14*y.getass()*y.getass()));
    }
}
class InheritanceSquare2 extends InheritancShape2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        InheritanceCircle2 y=new InheritanceCircle2();
    System.out.println("Enter - ");
    y.set(sc.nextInt());
    System.out.println("Area of square is "+(y.getass()*y.getass()));
}
}





    
    
                  