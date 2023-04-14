import java.util.Scanner;
class InheritanceStudent{
   private int rno;
   private String name;


   public void set(int r,String n){
    rno=r;
    name=n;
}
    public int getrno(){
        return rno;
    }
    public String getname(){
        return name;
    }
}

class InheritanceMarks extends InheritanceStudent{
    
    private float m1,m2,m3;

    public void set(float a,float b,float c){
       m1=a;
       m2=b;
       m3=c;
    }

    public float gettotal(){
        return m1+m2+m3;
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    InheritanceMarks x=new InheritanceMarks();
    System.out.println("Roll no. & Name is = ");
    x.set(sc.nextInt(),sc.next());
    System.out.println("Marks of 3 subjects are = ");
    x.set(sc.nextFloat(),sc.nextFloat(),sc.nextFloat());

    
System.out.println("Roll no. is = "+x.getrno());
System.out.println("Name is = "+x.getname());
System.out.println("Total Marks is = "+x.gettotal());
    
    
    }
}