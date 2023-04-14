import java.util.Scanner;
class Product{
    String pname;
    float price;
    float discount;

    public static void main(String[] args){
        Product p1=new Product();
        Product p2=new Product();
        Product p3=new Product();
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter name of product 1-  ");
        p1.pname=sc.next();
        System.out.println("Enter price of product- ");
        p1.price=sc.nextFloat();
        System.out.println("Enter discount given in %  b- ");
        p1.discount=sc.nextFloat();

        System.out.println("Enter name of product 2-  ");
        p2.pname=sc.next();
        System.out.println("Enter price of product- ");
        p2.price=sc.nextFloat();
        System.out.println("Enter discount given in % - ");
        p2.discount=sc.nextFloat();

        System.out.println("Enter name of product 3-  ");
        p3.pname=sc.next();
        System.out.println("Enter price of product- ");
        p3.price=sc.nextFloat();
        System.out.println("Enter discount given in % - ");
        p3.discount=sc.nextFloat();

        float a,b,c;

        a=p1.price*((100-p1.discount)/100);
        b=p2.price*((100-p2.discount)/100);
        c=p3.price*((100-p3.discount)/100);

        if(a>b&&a>c)
        {
            System.out.println("The product 1 is the most costly - "+a);
            System.out.println("The name of product 1 is -  "+p1.pname);
        }
        else
        if(b>a&&b>c)
        {
            System.out.println("The product 2 is the most costly - "+b);
            System.out.println("The name of product 2 is -  "+p2.pname);
        }
        else
        if(c>a&&c>b)
        {
            System.out.println("The product 3 is the most costly - "+c);
            System.out.println("The name of product 3 is -  "+p3.pname);
        }
}
}