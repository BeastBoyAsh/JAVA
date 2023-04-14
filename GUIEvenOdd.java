import java.awt.*;
import java.awt.event.*;

class M14 extends Frame implements ActionListener{

    Label l1,l2;
    Button b1,b2;
    TextField t1;
M14(){
    setLayout(null);

    l1=new Label("Number");
    l2=new Label(" ");
    

    b1=new Button("FIND");
    b2=new Button("EXIT");

    t1=new TextField();

   
    l1.setBounds(50,30,50,30);
    t1.setBounds(100,30,80,30);
    l2.setBounds(150,150,40,40);
    b1.setBounds(50,100,50,20);
    b2.setBounds(100,100,50,20);
    
    add(l1);
    add(t1);  
    add(b1);
    add(b2);
    add(l2);

    b1.addActionListener(this);
    b2.addActionListener(this);
}
    public static void main(String[] args){
        M14 f= new M14();
        f.setSize(400,300);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
        int a=Integer.parseInt(t1.getText());
        if(a%2==0)
        {
           l2.setText("EVEN");
        }
        else
        {
            l2.setText("ODD");
        }
        }
        if(e.getSource()==b2)
        {
           System.exit(0);
        }
    }
}
