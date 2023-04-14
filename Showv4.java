import java.util.Scanner;
class PrivateCircle{

    private float radius;

public void set(float r)
{
radius=r;
}

public float getradius(){
    return radius;
}
public float getarea(){
    return 3.14f*radius*radius;
}
}

class Showv4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    PrivateCircle p1=new PrivateCircle();
    
    System.out.println("The radius is - ");
    p1.set(sc.nextFloat());
    System.out.println("The area is - "+p1.getarea());
    
    
    }    
}
