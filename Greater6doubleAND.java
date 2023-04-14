class Greater6doubleAND
{
public static void main(String[]args)
{
int unit=346,bill;

System.out.println(" Unit is  " +unit);

if(unit>0 && unit<=100)
{
bill=unit*2;
System.out.println("Bill is "+bill);
}
else if(unit>100 && unit<=200)
{
bill=100*2+(unit-100)*3;
System.out.println("Bill is "+bill);
}
else if(unit>200 && unit<=300)
{
bill=200*3+(unit-200)*4;
System.out.println("Bill is "+bill);
}
else if(unit>300 && unit<=400)
{
bill=300*4+(unit-300)*5;
System.out.println("Bill is "+bill);
}
else
{
System.out.println("Invalid amount ");
}
}}