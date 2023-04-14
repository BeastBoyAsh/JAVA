import java.util.Scanner;
class TossCall2
{
public static void main(String[]args)
{
int a,b,c,d,e,f,g,h,i,j,k,l;
Scanner sc=new Scanner(System.in);
System.out.println("Oxygen level in Trainee 1 in 3 rounds :- ");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();

System.out.println("Oxygen level in Trainee 2 in 3 rounds :- ");
d=sc.nextInt();
e=sc.nextInt();
f=sc.nextInt();

System.out.println("Oxygen level in Trainee 3 in 3 rounds :- ");
g=sc.nextInt();
h=sc.nextInt();
i=sc.nextInt();

System.out.println("                  OXYGEN VALUES");
System.out.println(" Round 1 ");
System.out.println("Oxygen value of trainee 1 "+a);
System.out.println("Oxygen value of trainee 2 "+d);
System.out.println("Oxygen value of trainee 3 "+g);

System.out.println(" Round 2 ");
System.out.println("Oxygen value of trainee 1 "+b);
System.out.println("Oxygen value of trainee 2 "+e);
System.out.println("Oxygen value of trainee 3 "+h);

System.out.println(" Round 3 ");
System.out.println("Oxygen value of trainee 1 "+c);
System.out.println("Oxygen value of trainee 2 "+f);
System.out.println("Oxygen value of trainee 3 "+i);

j=(a+d+g)/3;
k=(b+e+h)/3;
l=(c+f+i)/3;

System.out.println("           AVERAGE OXYGEN VALUE");
System.out.println("Average Oxygen value of trainee 1 "+j);
System.out.println("Average Oxygen value of trainee 2 "+k);
System.out.println("Average Oxygen value of trainee 3 "+l);

System.out.println("           HIGHEST OXYGEN LEVEL");

if (j>k && j>l){
System.out.println("Trainee 1 "+j);
}
else
if (k>l && k>j){
System.out.println("Trainee 2 "+k);
}
else
if (l>k && l>j){
System.out.println("Trainee 3 "+l);
}

System.out.println("              UNFIT");

if(j<70)
  {System.out.println("Trainee 1 is Unfit");
  }
   
  if(k<70)
  {System.out.println("Trainee 2 is Unfit");
  }   
      
  if(l<70)
  {System.out.println("Trainee 3 is Unfit");
  }	
  
  if(j<70 && k<70 && l<70)
  {System.out.println("All are Unfit");
  }

  if(j>70 && k>70 && l>70)
  {System.out.println("All are Selected ");
  }
}}