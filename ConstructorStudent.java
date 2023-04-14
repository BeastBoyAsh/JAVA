class ConstructorStudent{
private int rno;
private String name;
private float marks;

    ConstructorStudent(){
        rno=0;
        name="Ashu";
        marks=0.0f;
    }
    
    ConstructorStudent(int r,String n,float m){
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
    
public static void main(String[] args){
    ConstructorStudent c1= new ConstructorStudent();
    System.out.println("Roll no. = "+c1.getrno());
    System.out.println("Name is = "+c1.getname());
    System.out.println("Marks = "+c1.getmarks());
    ConstructorStudent c2= new ConstructorStudent(2,"Ayush",22);
    System.out.println("Roll no. = "+c2.getrno());
    System.out.println("Name is = "+c2.getname());
    System.out.println("Marks = "+c2.getmarks());
    }
}