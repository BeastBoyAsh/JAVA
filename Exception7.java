class Exception7{
    public static void main(String[] args){
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
try{
System.out.println(a/b);
}
catch(ArithmeticException ex){
System.out.println("Can't be divided by 0 ");
}
catch(NumberFormatException ex){
System.out.println("You have inputted a string ");
}
    }
}