import java.util.Scanner;
class Student{

    private int rno;
    private String name;
    private float marks;
    private static String college;
     
    
public void set(int r,String n,float m)
{
rno=r;
name=n;
marks=m;
}

public static void set(String c)
{
college=c;
}

public int getrno()
{
return getrno();    
}
public String getname()
{
return getname();    
}
public float getmarks()
{
return getmarks();    
}

public static String getcollege()
{
return getcollege();
}
}

class Showv6{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
Student s1=new Student();
Student s2=new Student();
Student s3=new Student();

System.out.println("Enter Roll no. of Student 1 ");
System.out.println("Enter Name of Student 1 ");
System.out.println("Enter Marks of  1 ");
s1.set(sc.nextInt(),sc.next(),sc.nextFloat());


System.out.println("Enter Roll no. of Student 2 ");
System.out.println("Enter Name of Student 2 ");
System.out.println("Enter Marks of Student 2 ");
s2.set(sc.nextInt(),sc.next(),sc.nextFloat());


System.out.println("Enter Roll no. of Student 3 ");
System.out.println("Enter Name of Student 3 ");
System.out.println("Enter Marks of  3 ");
s3.set(sc.nextInt(),sc.next(),sc.nextFloat());

System.out.println("Enter College Name  ");
Student.set(sc.next());

System.out.println("Student 1 Details ");
System.out.println("Roll no. of Student 1 - "+s1.getrno());
System.out.println("Name of Student 1 - "+s1.getname());
System.out.println("Marks of student 1 - "+s1.getmarks());
System.out.println("Marks of student 1 - "+Student.getcollege());

System.out.println("Student 2 Details ");
System.out.println("Roll no. of Student 2 - "+s2.getrno());
System.out.println("Name of Student 2 - "+s2.getname());
System.out.println("Marks of student 2 - "+s2.getmarks());
System.out.println("Marks of student 2 - "+Student.getcollege());

System.out.println("Student 3 Details ");
System.out.println("Roll no. of Student 3 - "+s3.getrno());
System.out.println("Name of Student 3 - "+s3.getname());
System.out.println("Marks of student 3 - "+s3.getmarks());
System.out.println("Marks of student 3 - "+Student.getcollege());
}
}
