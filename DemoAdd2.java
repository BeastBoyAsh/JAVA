import java.util.Scanner;
class DemoAdd2{
    public static void main(String[] args) {
        
        DemoAdd d=new DemoAdd();
        
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        d.add(a,b); 
        
    }
}