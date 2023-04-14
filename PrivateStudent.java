import java.util.Scanner;
class PrivateStudent{
    private int rno;
    private String name;
    private float marks;
    public void set(int r,String n,float m)
    {
        rno=r;
        name=n;
        marks=m;
    }
    public int getrno()
    {
        return rno;
    }
    public String getname()
    {
        return name;
    }
    public float getmarks()
    {
        return marks;
    }
}
class Show{
    public static void main(String[] args){
    PrivateStudent p1=new PrivateStudent();
    p1.set(101,"Ayush",88);
    System.out.println("Roll number= "+p1.getrno());
    System.out.println("Name= "+p1.getname());
    System.out.println("Marks= "+p1.getmarks());
    }
}