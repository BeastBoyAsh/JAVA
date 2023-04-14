import java.util.Scanner;
class InheritanceMarks{
    
    protected float m1,m2,m3;

    public void set(float a,float b,float c){
        m1=a;
        m2=b;
        m3=c;
 }
}
 
class InheritanceSports extends InheritanceMarks{

    private float s;

public void set(float x){
   s=x;
}

public float gettotal(){
    return m1+m2+m3+s;
}

public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 InheritanceSports x=new InheritanceSports();

 System.out.println("Marks of 3 subjects are = ");

 x.set(sc.nextFloat(),sc.nextFloat(),sc.nextFloat());

 System.out.println("Marks of sports are = ");

 x.set(sc.nextFloat());

 System.out.println("Total Marks is = "+x.gettotal());

}
}








    
    
