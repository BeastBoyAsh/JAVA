import java.awt.*;
import java.awt.event.*;

class M13 extends Frame implements ActionListener{

    Label l1,l2,l3;
    Button b1,b2,b3,b4;
    TextField t1,t2,t3;
    Choice c1,c2,c3;
M13(){
    setLayout(null);

    l1=new Label("ITEM");
    l2=new Label("QTY.");
    l3=new Label("TAX");

    b1=new Button("OK");
 

    c1=new Choice();
    c1.add("PIZZA");
    c1.add("PASTA");


    c2=new Choice();
    int j;
    for(j=1;j<=100;j++)
    {
        c2.add(j+ "QTY.");
    }

    c3=new Choice();
    c1.add("NO");
    c1.add("GST");

    l1.setBounds(50,30,60,40);
    c1.setBounds(120,30,60,40);

    l2.setBounds(50,80,60,40);
    c2.setBounds(120,80,60,40);

    l3.setBounds(50,110,60,40);
    c3.setBounds(120,110,60,40);

    b1.setBounds(50,140,70,30);
   


    
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

}
    public static void main(String[] args){
        M13 f= new M13();
        f.setSize(300,300);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String a=c1.getSelectedItem();

        String b=c2.getSelectedItem();

        String c=c3.getSelectedItem();
 

        if(e.getSource()==b1)
        {
           System.out.println(a+b+c);
        }
        if(e.getSource()==b2)
        {
            System.out.println(((a+b+c/300)*100)+"%");
        }
        if(e.getSource()==b3)
        {
            int p=((a+b+c/300)*100);

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
