import java.util.Scanner;
class Money2
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int amt,a,b,c,d,e,f,g,h,i,j,k;
System.out.println(" Input amount ");
amt=sc.nextInt();

a=amt/500;
amt=amt%500;
System.out.println(" Total 500 notes. "+a);

b=amt/200;
amt=amt%200;
System.out.println(" Total 200 notes. "+b);

c=amt/100;
amt=amt%100;
System.out.println(" Total 100 notes. "+c);

d=amt/50;
amt=amt%50;
System.out.println(" Total 50 notes. "+d);


e=amt/20;
amt=amt%20;
System.out.println(" Total 20 notes. "+e);


f=amt/10;
amt=amt%10;
System.out.println(" Total 10 notes. "+f);

g=a+b+c+d+e+f;
System.out.println(" Total number of notes. "+g);


h=amt/5;
amt=amt%5;
System.out.println(" Total 5 coins. "+h);

i=amt/2;
amt=amt%2;
System.out.println(" Total 2 coins. "+i);

j=amt/1;
amt=amt%1;
System.out.println(" Total 1 coins. "+j);

k=h+i+j;
System.out.println(" Total number of coins. "+k);
}}

