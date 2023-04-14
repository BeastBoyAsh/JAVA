class StudentConstructor{
    int id;
    String name;

    StudentConstructor(int i,String n){
        id=i;
        name=n;
    }

    void display()
    {
        System.out.println(id+" "+name);
    }

    public static void main(String args[])
    {
        StudentConstructor s1=new StudentConstructor(001,"Ayush");
        StudentConstructor s2=new StudentConstructor(002,"Ashu");

        s1.display();
        s2.display();
    }
}