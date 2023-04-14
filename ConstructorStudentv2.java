import java.util.Scanner;
class ConstructorStudentv2{
    private int rno;
    private String name;
    private float marks;

ConstructorStudentv2(){
        rno=0;
        name="Ashu";
        marks=0.0f;
}

ConstructorStudentv2(int r,String n,float m){
    rno=r;
    name=n;
    marks=m;
}
public int getrno(){
    return rno;
}
public String getname(){
    return name;
}
public float getmarks(){
    return marks;
}
}
class Showv7{
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Detail of Students in order - ");

System.out.println("Roll no. = ");
System.out.println("Name is = ");
System.out.println("Marks = ");

ConstructorStudentv2 c1=new ConstructorStudentv2(sc.nextInt(),sc.next(),sc.nextFloat());
System.out.println("Enter The Detail of Students - ");
ConstructorStudentv2 c2=new ConstructorStudentv2(sc.nextInt(),sc.next(),sc.nextFloat());
System.out.println("Enter The Detail of Students - ");
ConstructorStudentv2 c3=new ConstructorStudentv2(sc.nextInt(),sc.next(),sc.nextFloat());

System.out.println("Roll no. = "+c1.getrno());
System.out.println("Name is = "+c1.getname());
System.out.println("Marks = "+c1.getmarks());

System.out.println("Roll no. = "+c2.getrno());
System.out.println("Name is = "+c2.getname());
System.out.println("Marks = "+c2.getmarks());

System.out.println("Roll no. = "+c3.getrno());
System.out.println("Name is = "+c3.getname());
System.out.println("Marks = "+c3.getmarks());

if(c1.getmarks()>c2.getmarks()&&c1.getmarks()>c3.getmarks()){
System.out.println("The highest marks is scored by student 1  = "+c1.getname());
}
else
if(c2.getmarks()>c1.getmarks()&&c2.getmarks()>c3.getmarks()){
    System.out.println("The highest marks is scored by student 3  = "+c2.getname());
    }
    else
    if(c3.getmarks()>c2.getmarks()&&c3.getmarks()>c1.getmarks()){
        System.out.println("The highest marks is scored by student 3  = "+c3.getname());
        }

    }
}