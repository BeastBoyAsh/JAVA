import java.util.Scanner;
abstract class Abstract1{

    protected int a,b;

    public void set(int x,int y){
      a=x;
      b=y;
    }
    public abstract void add();
}
class M extends Abstract1{
 public void add(){
    System.out.println(a+b);
 }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        M x=new M();
    x.set(8,9);
    x.add();
   }
}











    
    
                  
