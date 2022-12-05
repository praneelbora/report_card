import javax.swing.*;
import java.awt.event.*;

public class project implements ActionListener{
    JTextField numField;
    JFrame f= new JFrame();
    project()
    {
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel enterNum = new JLabel("Number of Students: ");
        enterNum.setBounds(10,10, 200,50);
        
        numField = new JTextField();
        numField.setBounds(230, 10, 200, 50);
        JButton b=new JButton("Submit");  
        b.setBounds(500,100,95,30);  
        b.addActionListener(this);
        
        f.add(numField);
        f.add(enterNum);
        f.add(b);
        f.setSize(1000,680);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        
        String str=numField.getText();
        int a=Integer.parseInt(str);
        f.dispose();
        int num=0;
        for(int j=0;j<a+1;j++,num++)
            accept_name.main(num);
    }
    public static void main(String[] args) 
    {   
        new project();
    } 
}