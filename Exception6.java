class Exception6{
    public static void main(String[] args){
int [] x=new int[5];
int b=0;
try{
System.out.println(x[7]/b);
}
catch(ArrayIndexOutOfBoundsException ex){
    System.out.println("Divide by 0 can't happen ");
}
catch(ArithmeticException ex){
    System.out.println("Incorrect ");
}
    }
}