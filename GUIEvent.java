import java.awt.*;
import java.awt.event.*;
class M6 extends Frame implements ActionListener{

    Button b1,b2;

M6(){
    b1=new Button("OK");
    b2=new Button("CANCEL");

    add(b1);
    add(b2);

   GridLayout g=new GridLayout(1,2);
   setLayout(g);
   b1.addActionListener(this);
   b2.addActionListener(this);
      
}
    public static void main(String[] args){
        M6 f= new M6();
        f.setSize(400,300);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            System.out.println("Ayush");
        }
        if(e.getSource()==b2)
        {
            System.out.println("Singh");
        }
    }
}