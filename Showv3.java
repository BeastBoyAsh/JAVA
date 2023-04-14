import java.util.Scanner;
class PrivateProduct{
   
    private String pname;
    private float price;
    private float discount;

public void set(String n,float p,float d)
{
    pname=n;
    price=p;
    discount=d;
}

public String getname(){
    return pname;
}
public float getprice(){
    return price;
}
public float getdiscount(){
    return discount;
}
}

class Showv3{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    PrivateProduct p1=new PrivateProduct();
    PrivateProduct p2=new PrivateProduct();
    PrivateProduct p3=new PrivateProduct();

    System.out.println("Enter Product Name- ");
    System.out.println("Enter Product Price- ");
    System.out.println("Enter Product Discount- ");
    p1.set(sc.next(),sc.nextFloat(),sc.nextFloat());
  

    System.out.println("Enter Product Name- ");
    System.out.println("Enter Product Price- ");
    System.out.println("Enter Product Discount- ");
    p2.set(sc.next(),sc.nextFloat(),sc.nextFloat());

    System.out.println("Enter Product Name- ");
    System.out.println("Enter Product Price- ");
    System.out.println("Enter Product Discount- ");
    p3.set(sc.next(),sc.nextFloat(),sc.nextFloat());

    float a,b,c;

        a=p1.getprice()*((100-p1.getdiscount())/100);
        b=p2.getprice()*((100-p2.getdiscount())/100);
        c=p3.getprice()*((100-p3.getdiscount())/100);



        if(a>b&&a>c)
        {
            System.out.println("The product 1 is the most costly - "+a);
            System.out.println("The name of product 1 is -  "+p1.getname());
        }
        else
        if(b>a&&b>c)
        {
            System.out.println("The product 2 is the most costly - "+b);
            System.out.println("The name of product 2 is -  "+p2.getname());
        }
        else
        if(c>a&&c>b)
        {
            System.out.println("The product 3 is the most costly - "+c);
            System.out.println("The name of product 3 is -  "+p3.getname());
        }
}
}
