import java.util.Scanner;
class PrivateRectangle{

    private int l,b;

public void set(int a,int c)
{
l=a;
b=c;
}

public int getlength(){
    return l;
}
public int getbreadth(){
    return b;
}
public int getarea(){
    return l*b;
}
}

class Showv5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    PrivateRectangle p1=new PrivateRectangle();
    
    System.out.println("The Length & Breadth is - ");
    p1.set(sc.nextInt(),sc.nextInt());
    System.out.println("The area is - "+p1.getarea());
    
    
    }    
}
