import java.util.Scanner;
class InheritancCircle3{
    
    protected int radius;

    public void set(int r){
      radius=r;
    }
    public int getradius(){
        return radius;
    }
    public void area(){
        
        System.out.println("Area of circle is "+(3.14*getradius()*getradius()));
    }
}    

class InheritanceSquare3 extends InheritancCircle3{
   
    public void area(){
        super.area();
        System.out.println("Area of square is "+(getradius()*getradius()));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        InheritanceSquare3 y=new InheritanceSquare3();
        System.out.println("Enter Side - ");
        y.set(sc.nextInt());
        y.area();
    }
}    







    
    
                  
