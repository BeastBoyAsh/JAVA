class Money
{
public static void main(String[]args)
{
int amt=2470,a,b,c,d,e,f,g;
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

}}
