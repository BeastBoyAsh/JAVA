class GreaterCommandLine{
public static void main(String[]args){

int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);

if(a>b && a>c){
System.out.println("A is greater "+a);
}
else
if(b>a && b>c){
System.out.println("B is greater "+b);
}
if(c>a && c>b){
System.out.println("C is greater "+c);
}

}}