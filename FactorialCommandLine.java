class FactorialCommandLine{
public static void main(String[]args){

int a=Integer.parseInt(args[0]);

int i,f=1;
for(i=a;i>=1;i--){
f=f*i;
}
System.out.println("Factorial is "+f);

}

}