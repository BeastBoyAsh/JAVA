import java.awt.*;
import java.awt.event.*;

class M15 extends Frame implements ActionListener{

    Label l1,l2,l3;
    Button b1,b2,b3,b4,b5;
    TextField t1,t2;
M15(){
    setLayout(null);

    l1=new Label("Number A");
    l2=new Label("Number B");
    l3=new Label(" ");

    b1=new Button("ADD");
    b2=new Button("SUB");
    b3=new Button("MUL");
    b4=new Button("DIV");
    b5=new Button("EXIT");

    t1=new TextField();
    t2=new TextField();
   
    l1.setBounds(50,30,60,30);
    t1.setBounds(130,30,80,30);
    l2.setBounds(50,70,60,30);
    t2.setBounds(130,70,80,30);
    b1.setBounds(50,120,50,30);
    b2.setBounds(100,120,50,30);
    b3.setBounds(50,160,50,30);
    b4.setBounds(100,160,50,30);
    b5.setBounds(75,200,50,30);
    l3.setBounds(75,240,50,30);
    
    add(l1);
    add(l2);
    add(l3);
    add(t1);
    add(t2);
    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(b5);

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
}
    public static void main(String[] args){
        M15 f= new M15();
        f.setSize(300,300);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {

        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        
        if(e.getSource()==b1)
        {
            l3.setText(a+b+"");
        }
        if(e.getSource()==b2)
        {   
            l3.setText(a-b+"");
        }
        if(e.getSource()==b3)
        {  
            l3.setText(a*b+"");
        }
        if(e.getSource()==b4)
        {
            
            l3.setText(a/b+"");
        }
        if(e.getSource()==b5)
        {
            System.exit(0);
        }
    }
}
