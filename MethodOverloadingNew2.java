
public class MethodOverloadingNew2{
    public int sum(int x,int y)
    {
        return(x+y);
    }

    public int sum(int x,int y,int z)
    {
        return(x+y+z);
    }

    public double sum(double x,double y)
    {
        return(x+y);
    }

    public static void main(String[] args)
    {
        MethodOverloadingNew2 M1=new MethodOverloadingNew2();

System.out.println(M1.sum(10,20));
System.out.println(M1.sum(10,20,30));
System.out.println(M1.sum(10.44,20.34));

    }}