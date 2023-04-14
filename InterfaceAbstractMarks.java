import java.util.Scanner;
abstract class Marks{
    protected float m1,m2,m3;
    public void set(float x,float y,float z){
        m1=x;
        m2=y;
        m3=z;
    }
}

interface IMarks{
    public abstract void calculate();
}

class Total extends Marks implements IMarks{
    public void calculate()
    {
        System.out.println("Total is = "+(m1+m2+m3));
    }
    public static void main(String[] args){
    Total t=new Total();
    t.set(23,45,22);
    t.calculate();
}

}