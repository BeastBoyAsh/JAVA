import java.awt.*;
import java.awt.event.*;
class M12 extends Frame implements ActionListener{

    Label l1,l2;
    Button b1;
    Choice c1,c2;
    
M12(){
    setLayout(null);

    l1=new Label("BRANCH");
    l2=new Label("SEM");

    b1=new Button("OK");

    
    c1=new Choice();
    c1.add("IT");
    c1.add("CSE");
    c1.add("EE");
    c1.add("CIVIl");
    c1.add("MECH.");
    c1.add("EEE");

    c2=new Choice();
    int i;
    for(i=1;i<=8;i++)
    {
        c2.add(i+ "SEMESTER");
    }



    l1.setBounds(50,30,40,30);
    c1.setBounds(100,30,80,30);

    l2.setBounds(50,70,40,30);
    c2.setBounds(100,70,80,30);

    b1.setBounds(50,120,50,20);

    
    

    add(b1);

    add(l1);
    add(l2);

    add(c1);
    add(c2);

    b1.addActionListener(this);
}
    public static void main(String[] args){
        M12 f= new M12();
        f.setSize(400,300);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String x=c1.getSelectedItem();
        String y=c2.getSelectedItem();
        if(e.getSource()==b1)
        {
           System.out.println(x);
           System.out.println(y);
        }
    }
}