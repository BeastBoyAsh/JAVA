import java.util.Stack;

class Stack{
public static void main(String[] args){
Stack<Integer> s=new Stack<Integer>();
s.push(10);
s.push(30);
for (int v:s){
    System.out.println(v);
}
System.out.println("Del element is  ="+s.pop());
}
}