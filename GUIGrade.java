import java.awt.*;
import java.awt.event.*;

class M11 extends Frame implements ActionListener{

    Label l1,l2,l3;
    Button b1,b2,b3,b4;
    TextField t1,t2,t3;
    Choice c1,c2,c3;
M11(){
    setLayout(null);

    l1=new Label("TERM 1");
    l2=new Label("TERM 2");
    l3=new Label("TERM 3");

    b1=new Button("TOTAL");
    b2=new Button("PERCENTAGE");
    b3=new Button("GRADE");
    b4=new Button("EXIT");

    c1=new Choice();
    int i;
    for(i=1;i<=100;i++)
    {
        c1.add(i);
    }

    c2=new Choice();
    int j;
    for(j=1;j<=100;j++)
    {
        c2.add(j);
    }

    c3=new Choice();
    int k;
    for(k=1;k<=100;k++)
    {
        c3.add(k);
    }

    l1.setBounds(50,50,60,40);
    c1.setBounds(120,50,60,40);

    l2.setBounds(50,80,60,40);
    c2.setBounds(120,80,60,40);

    l3.setBounds(50,110,60,40);
    c3.setBounds(120,110,60,40);

    b1.setBounds(50,140,70,30);
    b2.setBounds(130,140,70,30);         
    b3.setBounds(50,190,70,30);
    b4.setBounds(130,190,70,30);


    
    add(l1);
    add(l2);
    add(l3);
    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(c1);
    add(c2);
    add(c3);


    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
}
    public static void main(String[] args){
        M11 f= new M11();
        f.setSize(300,300);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String x=c1.getSelectedItem();
int a=Integer.parseInt(x);
        String y=c2.getSelectedItem();
int b=Integer.parseInt(y);
        String z=c3.getSelectedItem();
int c=Integer.parseInt(z);
        int p;
 

        if(e.getSource()==b1)
        {
           System.out.println(a+b+c);
        }
        if(e.getSource()==b2)
        {
            System.out.println((a+b+c)/3);
        }
        if(e.getSource()==b3)
        {
          p=(a+b+c)/3;
            if(p>=75 && p<=100)
                     {
System.out.println("Grade A");
}
                      if(p>=60 && p<=74)
                     {
System.out.println("Grade B");
}
                      if(p>=40 && p<=59)
                     {
System.out.println("Grade Barely Pass");
}
                      if(p>=0 && p<=40)
                     {
System.out.println("Grade Fail");
}
        }
        if(e.getSource()==b4)
        {
            System.exit(0);
        }
    }
}
