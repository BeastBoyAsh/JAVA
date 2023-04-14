
public class Student5thSem{
    private String name;
    private int ID;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID=ID;
    }

    public static void main(String[] args){
        Student5thSem s1=new Student5thSem();
    System.out.println("Student Bio ");
    System.out.println("Name "+s1.getName());
    System.out.println("ID "+s1.getID());

    s1.setName("Ayush");
    s1.setID(001);

    System.out.println("Student Bio ");
    System.out.println("Name "+s1.getName());
    System.out.println("ID "+s1.getID());

    
    

}}