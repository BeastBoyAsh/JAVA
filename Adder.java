
public class Adder{

    static int add(int x,int y)
    {
        return x+y;
    }

    static double add(double x,double y)
    {
        return x+y;
    }

}
class TestOverloading2{
    public static void main(String[] args)
    {
        System.out.println(Adder.add(10,20));
        System.out.println(Adder.add(10.44,20.34));
    }

}
   
  