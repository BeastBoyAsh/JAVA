import java.util.Scanner;
class Student2{
    int r;
    String n;
    float m1,m2,m3;

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x,i;
    System.out.println("Enter the number of enteries ");
    x=sc.nextInt();
        
    for(i=1;i<=x;i++)
    {
    Student s1=new Student();
    
   
    System.out.println("Enter Roll no. of Student ");
    s1.r=sc.nextInt();
    System.out.println("Enter Name of Student ");
    s1.n=sc.next();
    System.out.println("Enter Marks of 3 subject of Student ");
    s1.m1=sc.nextFloat();
    s1.m2=sc.nextFloat();
    s1.m3=sc.nextFloat();

    float t;
    t=s1.m1+s1.m2+s1.m3;
    
    System.out.println("Roll Number of Student  "+t);
    System.out.println("Name of Student  "+t);
    System.out.println("Total Marks of Student  "+t);
    }

    }
}