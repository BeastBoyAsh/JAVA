import java.util.Scanner;
import java.math.lang;
abstract class AbstractShape{
    protected int a;
    public void set(int x){
        a=x;
    }
public abstract void calculate();
}
class Q extends AbstractShape{
    public void calculate()
    {
        
        System.out.println("Cube is = "+a*a*a);
    }
}
class R extends AbstractShape{
    public void calculate()
    {
    
        System.out.println("Square is = "+a*a);
    }
}
class S extends AbstractShape{
    public void calculate()
    {
        System.out.println("Squareroot is = "+Math.sqrt(a));
    }
    public static void main(String[] args){
    S x=new S();
    Q y=new Q();
    R z=new R();
    x.set(16);
    y.set(16);
    z.set(16);
    x.calculate();
    y.calculate();
    z.calculate();
}
}