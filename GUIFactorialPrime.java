import java.awt.*;
import java.awt.event.*;

class M10 extends Frame implements ActionListener{

    Label l1,l2,l3;
    Button b1,b2,b3;
    TextField t1,t2,t3;
M10(){
    setLayout(null);

    l1=new Label("Number A");

    b1=new Button("PRIME");
    b2=new Button("FACTORIAL");
    b3=new Button("EXIT");

    t1=new TextField();

    l1.setBounds(50,30,60,40);
    t1.setBounds(130,30,80,30);

    b1.setBounds(50,90,70,30);
    b2.setBounds(130,90,70,30);
    b3.setBounds(90,140,50,30);

    
    add(l1);
    add(t1);
    add(b1);
    add(b2);
    add(b3);


    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
}
    public static void main(String[] args){
        M10 f= new M10();
        f.setSize(300,300);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String x=t1.getText();
        int a=Integer.parseInt(x);


        if(e.getSource()==b1)
        {
            int i,c=0;
            for(i=1;i<=a;i++)
            {
                if(a%i==0)
                {
                    c=c+1;
                }
            }
            if(c==2){
            System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        if(e.getSource()==b2)
        {
            int i,f=1;
            for(i=a;i>=1;i--)
            {
              f=f*i;
            }
            System.out.println(f);
        }
        if(e.getSource()==b3)
        {
            System.exit(0);
        }
    }
}
