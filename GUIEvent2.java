import java.awt.*;
import java.awt.event.*;

class M7 extends Frame implements ActionListener{

    Label l1;
    Button b1,b2;
    TextField t1;
M7(){
    setLayout(null);

    l1=new Label("Number");

    b1=new Button("OK");
    b2=new Button("EXIT");

    t1=new TextField();

   
    l1.setBounds(50,30,50,30);
    t1.setBounds(100,30,80,30);
    b1.setBounds(50,100,50,20);
    b2.setBounds(100,100,50,20);
    
    add(b1);

    add(l1);
   
    add(t1);
 
    add(b2);
    b1.addActionListener(this);
    b2.addActionListener(this);
}
    public static void main(String[] args){
        M7 f= new M7();
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
            System.out.println("Even");
        }
        else
        {
            System.out.println("odd");
        }
        }
        if(e.getSource()==b2)
        {
           System.exit(0);
        }
    }
}
