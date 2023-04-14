import java.util.ArrayList;
import java.util.Scanner;

class ArrayListStudentv2{
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
    ArrayList<ArrayListStudentv2> l=new ArrayList<ArrayListStudentv2>();
    Scanner sc=new Scanner(System.in);
    for(i=0;i<=1;i++)
    {
    ArrayListStudentv2 s1=new ArrayListStudentv2();
System.out.println("Enter Roll no. of Student  ");
System.out.println("Enter Name of Student ");
System.out.println("Enter Marks  ");
s1.set(sc.nextInt(),sc.next(),sc.nextFloat());
l.add(s1);
}

for(ArrayListStudentv2 v:l)
{
    if(v.getmarks()>m)
    {
       m=v.getmarks();
    }
}
for(ArrayListStudentv2 v:l)
{
    if(v.getmarks()==m)
    {
        System.out.println("Highest Marks = "+v.getmarks());        
    }
}
}
}
