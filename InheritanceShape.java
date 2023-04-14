import java.util.Scanner;
class InheritancShape{
    
    private int a;

    public void set(int x){
      a=x;
    }
    public int getass(){
        return a;
    }
}    

class InheritanceCircle extends InheritancShape{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        InheritanceCircle y=new InheritanceCircle();
        
System.out.println("Enter - ");
        y.set(sc.nextInt());
        System.out.println("Area of circle is "+(3.14*y.getass()*y.getass()));
    }
}
class InheritanceSquare extends InheritancShape{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        InheritanceCircle l=new InheritanceCircle();
    System.out.println("Enter - ");
    l.set(sc.nextInt());
    System.out.println("Area of square is "+(l.getass()*l.getass()));
}
}





    
    
                  