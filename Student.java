import java.util.Scanner;
class Student{
    int r;
    String n;
    float m1,m2,m3;

    public static void main(String[] args){
    Student s1=new Student();
    Student s2=new Student();
  
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Roll no. of Student 1 ");
    s1.r=sc.nextInt();
    System.out.println("Enter Name of Student 1 ");
    s1.n=sc.next();
    System.out.println("Enter Marks of 3 subject of Student 1 ");
    s1.m1=sc.nextFloat();
    s1.m2=sc.nextFloat();
    s1.m3=sc.nextFloat();
   
    System.out.println("Enter Roll no. of Student 2 ");
    s2.r=sc.nextInt();
    System.out.println("Enter Name of Student 2 ");
    s2.n=sc.next();
    System.out.println("Enter Marks of 3 subject of Student 2 ");
    s2.m1=sc.nextFloat();
    s2.m2=sc.nextFloat();
    s2.m3=sc.nextFloat();

    float t1,t2;
    t1=s1.m1+s1.m2+s1.m3;
    t2=s2.m1+s2.m2+s2.m3;
    
    System.out.println("Total Marks of Student 1 "+t1);
    System.out.println("Total Marks of Student 1 "+t2);


    if(t1>t2)
    {
        System.out.println("Student 1 got 1st Rank with Total Marks "+t1);
        System.out.println("Name of Student 1 "+s1.n);
        System.out.println("Roll Number of Student 1 "+s1.r);
    }
    else 
    if(t2>t1)
    {
        System.out.println("Student 2 got 1st Rank with Total Marks "+t2);
        System.out.println("Name of Student 2 "+s2.n);
        System.out.println("Roll Number of Student 1 "+s2.r);
    }
    }
}