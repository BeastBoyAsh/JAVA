import java.util.Scanner;
class MethodOverloading{
    void area(int r)
    {
        float a;
        a=3.14f*r*r;
        System.out.println("Area of Circle is "+a);
    }
    void area(int l,int b)
    {
        int a;
        a=l*b;
        System.out.println("Area of Rectngle is "+a);
    }
    void area(long b,long h)
    {
        float a;
        a=0.5f*b*h;
        System.out.println("Area of Triangle is "+a);
    }
    public static void main(String[] args) {
        MethodOverloading s=new MethodOverloading();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius ");
        s.area(sc.nextInt());
        System.out.println("Enter the Length & Breadth of Rectangle ");
        s.area(sc.nextInt(),sc.nextInt());
        System.out.println("Enter the Breadth & Height of Triangle ");
        s.area(sc.nextLong(),sc.nextLong());
}
}