import java.util.Scanner;
class InheritancStudentv2{
    
    private int rno;
    private String name;

    public void set(int a,String n){
        rno=a;
        name=n;
    }
    public int getrollno(){
        return rno;
    }
    
    public String getname(){
        return name;
    }
}    

class InheritanceMarksv4 extends InheritancStudentv2{

    protected float m1,m2,m3;

    public void set(float x,float y,float z){
        m1=x;
        m2=y;
        m3=z;
     }
    }
    
class InheritanceSportsv4 extends InheritanceMarksv4{

   private float s;

   public void set(float c){
       s=c;
    }

public void total(){
    System.out.println(m1+m2+m3+s);
}

public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 InheritanceSportsv4 z=new InheritanceSportsv4();
 
   
System.out.println("Enter Roll no.& Name - ");
z.set(sc.nextInt(),sc.next());
 z.set(2,3,4);
 z.set(1);
 z.total();
    }
}








    
    
                  