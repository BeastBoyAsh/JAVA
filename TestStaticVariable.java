class Student123{
    int rollno;
    String name;
    static String college="ITS";
    Student123(int r,String n){
        rollno=r;
        name=n;
    }
    void display()
    {
        System.out.println(rollno+"  "+name+"  "+college);
    }
}

public class TestStaticVariable{
    public static void main(String[] args){
        Student123 S1=new Student123(7,"Ayush");
        Student123 S2=new Student123(8,"Ashu");
        S1.display();
        S2.display();
    }
}