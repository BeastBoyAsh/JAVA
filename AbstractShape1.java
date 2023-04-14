import java.util.Scanner;
import java.math.lang;
abstract class AbstractShape1{
    protected int a,b;
    public void set(int x,int y){
        a=x;
        b=y;
    }
public abstract void calculate();
}
class Q1 extends AbstractShape1{
    public void calculate()
    {
        
        System.out.println("Add is = "+(a+b));
    }
}
class R1 extends AbstractShape1{
    public void calculate()
    {
        int j,c=0;
        for(j=a;j<=b;j++)
        {
                c=c+j;
        }
        System.out.println("Sum in range is = "+c);
    }
}
class S1 extends AbstractShape1{
    public void calculate()
    {
        int i,s=0;
        for(i=a;i<=b;i++)
        {
            if(i%2==0){
                s=s+i;
            }
        }
        System.out.println("The even sum in range is = "+s);
    }
    public static void main(String[] args){
    S1 x=new S1();
    Q1 y=new Q1();
    R1 z=new R1();
    x.set(2,9);
    y.set(2,9);
    z.set(2,9);
    x.calculate();
    y.calculate();
    z.calculate();
}
}