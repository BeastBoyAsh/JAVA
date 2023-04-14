import java.util.Scanner;
abstract class InterfaceData{
    protected int a,b;
    public void set(int x,int y){
    a=x;
    b=y;
    }
}

interface I1{
    public void calculate1();
}


interface I2{
    public void calculate2();
}

interface I3{
    public void calculate3();
}

class Total1 extends InterfaceData implements I1,I2,I3{
    public void calculate1(){
    System.out.println("Total is = "+(a+b));
}
public void calculate2(){
    System.out.println("Sub is = "+(a-b));
}    
public void calculate3(){
    if(a>b){
    System.out.println("A is greater = "+a);
    }
    else
    if(b>a){
    System.out.println("B is greater = "+b);
    }
}
    public static void main(String[] args){
    Total1 t=new Total1();
    t.set(23,45);
    t.calculate1();
    t.calculate2();
    t.calculate3();
}

}