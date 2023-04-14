import java.util.TreeSet;
import java.util.Scanner;

class TreeSett{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        TreeSet<Integer> s=new TreeSet<Integer>();
        s.add(2);
        s.add(3);
        s.add(6);
        s.add(1);
        s.add(8);
        s.add(7);
        s.add(2);
        s.add(3);
for(int v:s)
{
    System.out.println(v);
}

}
}