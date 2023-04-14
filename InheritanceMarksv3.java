import java.util.Scanner;
class InheritanceMarksv3{
    
    protected int a,b;

    public void set(int x,int y){
      a=x;
      b=y;
 }
}
 
class InheritanceSportsv3 extends InheritanceMarksv3{

    private int s;
    public void set(int c){
        s=c;
     }


public void total(){
    System.out.println(a+b+s);
}
public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 InheritanceSportsv3 z=new InheritanceSportsv3();

 z.set(7,8);
 z.set(8);
 z.total();
    }
}








    
    
                  