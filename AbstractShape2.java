import java.util.Scanner;
import java.math.lang;
abstract class AbstractShape2{
    protected int a;
    public void set(int x){
        a=x;
    }
public abstract void calculate();
}
class Prime extends AbstractShape2{
    public void calculate()
    {
        int p=a;
        int i,c=0;
        for(i=1;i<=p;i++)
        {
            if(p%i==0)
            {
                c=c+1;
            }
        }
        if(c==2)
        {
        System.out.println("Its a prime number = "+a);
        }
        else
        System.out.println("Its not a prime number = "+a);
    }
}
class Pallindrome extends AbstractShape2{
    public void calculate()
    {
        int q=a;
        int b,r=0;
      while(q!=0)
      {
          b=q%10;
          r=r*10+b;
          q=q/10;
      }
      if(r==a)
      {
        System.out.println("Its a pallindrome number = "+r);
      }
      else
      System.out.println("Its not a pallindrome number = "+r);
    }
}
class Armstronhg extends AbstractShape2{
    public void calculate()
    {
        int s=a;
        int d,l=0;
        while(s!=0)
        {
            d=s%10;
            l=l+d*d*d;
            s=s/10;
        }
        if(l==a)
        {
            System.out.println("Its an armstrong number = "+a);
        }
        else
        System.out.println("Its not an armstrong number = "+a);
    }
    public static void main(String[] args){
    Prime x=new Prime();
    Pallindrome y=new Pallindrome();
    Armstronhg z=new Armstronhg();
    x.set(7);
    y.set(121);
    z.set(153);
    x.calculate();
    y.calculate();
    z.calculate();
}
}