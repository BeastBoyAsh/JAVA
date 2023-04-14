import java.awt.*;
import java.awt.event.*;

class M9 extends Frame implements ActionListener{

    Label l1,l2,l3;
    Button b1,b2,b3;
    TextField t1,t2,t3;
M9(){
    setLayout(null);

    l1=new Label("Number A");
    l2=new Label("Number B");
    l3=new Label("Number C");

    b1=new Button("GREATEST");
    b2=new Button("SMALLEST");
    b3=new Button("EXIT");

    t1=new TextField();
    t2=new TextField();
    t3=new TextField();
   
    l1.setBounds(50,30,60,40);
    t1.setBounds(130,30,80,30);
    l2.setBounds(50,70,60,40);
    t2.setBounds(130,70,80,30);
    l3.setBounds(50,110,60,40);
    t3.setBounds(130,110,80,30);
    
    b1.setBounds(50,140,70,30);
    b2.setBounds(130,140,70,30);
    b3.setBounds(90,170,50,30);

    
    add(l1);
    add(l2);
    add(l3);
    add(t1);
    add(t2);
    add(t3);
    add(b1);
    add(b2);
    add(b3);


    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
}
    public static void main(String[] args){
        M9 f= new M9();
        f.setSize(300,300);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String x=t1.getText();
        int a=Integer.parseInt(x);
        String y=t2.getText();
        int b=Integer.parseInt(y);
        String z=t3.getText();
        int c=Integer.parseInt(z);

        if(e.getSource()==b1)
        {
            if(a>b && a>c)
            {
            System.out.println(a);
            }
            else
            if(b>a && b>c)
            {
            System.out.println(b);
            }
            else
            if(c>a && c>b)
            {
            System.out.println(c);
            }
        }
        if(e.getSource()==b2)
        {
            if(b>a && c>a)
            {
            System.out.println(a);
            }
            else
            if(a>b && c>b)
            {
            System.out.println(b);
            }
            else
            if(a>c && b>c)
            {
            System.out.println(c);
            }
        }
        if(e.getSource()==b3)
        {
            System.exit(0);
        }
    }
}
