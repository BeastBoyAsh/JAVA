import java.util.Scanner;
class Money3
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int amt,a,b,c,d,e,f,g,h,i,j,k;
System.out.println(" Input amount ");
amt=sc.nextInt();

a=amt;


if(amt>=500){
a=amt/500;
amt=amt%500;
System.out.println(" Total 500 notes. "+a);
}

else
if(amt>=200){
b=amt/200;
amt=amt%200;
System.out.println(" Total 200 notes. "+b);
}

else
if(amt>=100){
c=amt/100;
amt=amt%100;
System.out.println(" Total 100 notes. "+c);
}

else
if(amt>=50){
d=amt/50;
amt=amt%50;
System.out.println(" Total 50 notes. "+d);
}
else
if(amt>=20){
e=amt/20;
amt=amt%20;
System.out.println(" Total 20 notes. "+e);
}

else
if(amt>=10){
f=amt/10;
amt=amt%10;
System.out.println(" Total 10 notes. "+f);

}
g=a+b+c+d+e+f;

System.out.println(" Total number of notes. "+g);


}}

