import java.util.ArrayList;
import java.util.Scanner;

class ArrayListStudent{
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

public static void main(String[] args){
    int i;
    ArrayList<ArrayListStudent> l=new ArrayList<ArrayListStudent>();
    Scanner sc=new Scanner(System.in);
    for(i=0;i<=1;i++)
    {
    ArrayListStudent s1=new ArrayListStudent();
System.out.println("Enter Roll no. of Student  ");
System.out.println("Enter Name of Student ");
System.out.println("Enter Marks  ");
s1.set(sc.nextInt(),sc.next(),sc.nextFloat());
l.add(s1);
}

for(ArrayListStudent v:l)
{
System.out.println("Roll no. = "+v.getrno());
System.out.println("Name = "+v.getname());
System.out.println("Marks = "+v.getmarks());
}

}
}