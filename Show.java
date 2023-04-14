import java.util.Scanner;
class PrivateEmployee{
    private int id;
    private String name;
    private float salary;

public void set(int i,String n,float s)
{
    id=i;
    name=n;
    salary=s;
}
public int getid(){
    return id;
}
public String getname(){
    return name;
}
public int getsalary(){
    return salary;
}
}

class Show{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    PrivateEmployee p1=new PrivateEmployee();
    PrivateEmployee p2=new PrivateEmployee();

    System.out.println("Enter ID, Name & Salary - ");
    p1.set(sc.nextInt(),sc.next(),sc.nextFloat());
    System.out.println("Enter ID, Name & Salary - ");
    p2.set(sc.nextInt(),sc.next(),sc.nextFloat());

    if(p1.getsalary()>p2.getsalary())
    {
        System.out.println(p1.getname()+" Salary is more");
    }
    else
    {
    System.out.println(p2.getname()+" Salary is more");
    }
}
}
