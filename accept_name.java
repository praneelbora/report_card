import javax.swing.*;
import java.awt.event.*;

public class accept_name implements ActionListener
{
    JTextField name2,roll2;
    String name;
    int roll;
    JFrame f= new JFrame();
    int i=0;
    accept_name(int i)
    {
        this.i=i;
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel enterName = new JLabel("Name : ");
        enterName.setBounds(10,10, 200,50);
        
        name2 = new JTextField();
        name2.setBounds(230, 10, 200, 50);
        
        JLabel enterRoll= new JLabel("Roll Number : ");
        enterRoll.setBounds(450,10, 200,50);
        
        roll2 = new JTextField();
        roll2.setBounds(650, 10, 200, 50);
        
        JButton b=new JButton("Submit");  
        b.setBounds(500,200,95,30); 
         
        b.addActionListener(this);
        
        f.add(enterName);
        f.add(name2);
        f.add(enterRoll);
        f.add(roll2);
        f.add(b);
        f.setSize(1000,680);
        f.setLayout(null);
        f.setVisible(true);
        this.roll=0;
        this.name="";
    }
    public void actionPerformed(ActionEvent e) 
    {
        name=name2.getText();
        roll=Integer.parseInt(roll2.getText());

        name2.setText("");
        roll2.setText("");

        accept_marks.main(name,roll,i);
        f.dispose();
    }
    public static void main(int i) 
    {
        new accept_name(i);
    }
}