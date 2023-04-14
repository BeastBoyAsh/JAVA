import java.util.Scanner;
class InheritanceStudent{
    
    private int rno;
    private String name;

    InheritanceStudent()
    {
        rno=1;
        name="Ayu";
    }
    Inheritancetudent(int r,String n)
    {
        rno=r;
        name=n;
    }
   
    public int getrno(){
        return rno;
    }
    public string getname(){
        return name;
    }
}    

class InheritanceMarksv5 extends InheritanceStudent{
    private float marks;
    InheritanceMarksv5(){
        marks=88;
    }
    InheritanceMarksv5(int r,String n,float z){
        super("a",22);
        marks=z;
    }
    public float getmarks(){
        return marks;
    }
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    InheritanceMarksv5 y=new InheritanceMarksv5(111,"as",70);
   }
}











    
    
                  
