import javax.swing.*;
import java.awt.event.*;

import SY_Engineering.Display;
import SY_Engineering.Student;

public class accept_marks implements ActionListener
{
    String name;
    int roll;
    JFrame f= new JFrame();
    int i=0;
    JTextField IseOopTextField,EseOopTextField,IaOopTextField;
    JTextField IseItvcTextField,EseItvcTextField,IaItvcTextField;
    JTextField IseDsTextField,EseDsTextField,IaDsTextField;
    JTextField IseCoaTextField,EseCoaTextField,IaCoaTextField;
    JTextField IseDsmTextField,EseDsmTextField,IaDsmTextField;
    accept_marks(String name,int num,int i)
    {
        this.i=i;
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.name=name;
        this.roll=num;
        int x=10;
        int y=0;
        {    //OOP MARKS
            JLabel OopTitle = new JLabel("OOP");
            OopTitle.setBounds(x,y, 200,50);
            f.add(OopTitle);

            JLabel enterOopIse = new JLabel("Please Enter ISE marks: ");
            enterOopIse.setBounds(x,y+25, 200,50);
            f.add(enterOopIse);

            IseOopTextField = new JTextField();
            IseOopTextField.setBounds(x+220, y+25, 200, 50);
            f.add(IseOopTextField);

            JLabel enterOopEse = new JLabel("Please Enter Your ESE Marks: ");
            enterOopEse.setBounds(x+440,y+25, 200,50);
            f.add(enterOopEse);

            EseOopTextField = new JTextField();
            EseOopTextField.setBounds(x+640, y+25, 200, 50);
            f.add(EseOopTextField);

            JLabel enterOopIa = new JLabel("Please Enter CA marks: ");
            enterOopIa.setBounds(x,y+75, 200,50);
            f.add(enterOopIa);

            IaOopTextField = new JTextField();
            IaOopTextField.setBounds(x+220, y+75, 200, 50);
            f.add(IaOopTextField);
        }


        {   //ITVC MARKS 
            y=125;
            JLabel ItvcTitle = new JLabel("ITVC");
            ItvcTitle.setBounds(x,y, 200,50);
            f.add(ItvcTitle);

            JLabel enterItvcIse = new JLabel("Please Enter ISE marks: ");
            enterItvcIse.setBounds(x,y+25, 200,50);
            f.add(enterItvcIse);

            IseItvcTextField = new JTextField();
            IseItvcTextField.setBounds(x+220, y+25, 200, 50);
            f.add(IseItvcTextField);

            JLabel enterItvcEse = new JLabel("Please Enter Your ESE Marks: ");
            enterItvcEse.setBounds(x+440,y+25, 200,50);
            f.add(enterItvcEse);

            EseItvcTextField = new JTextField();
            EseItvcTextField.setBounds(x+640, y+25, 200, 50);
            f.add(EseItvcTextField);

            JLabel enterItvcIa = new JLabel("Please Enter CA marks: ");
            enterItvcIa.setBounds(x,y+75, 200,50);
            f.add(enterItvcIa);

            IaItvcTextField = new JTextField();
            IaItvcTextField.setBounds(x+220, y+75, 200, 50);
            f.add(IaItvcTextField);
        }

        
        {   //DS MARKS  
            y=250;
            JLabel DsTitle = new JLabel("DS");
            DsTitle.setBounds(x,y, 200,50);
            f.add(DsTitle);

            JLabel enterDsIse = new JLabel("Please Enter ISE marks: ");
            enterDsIse.setBounds(x,y+25, 200,50);
            f.add(enterDsIse);

            IseDsTextField = new JTextField();
            IseDsTextField.setBounds(x+220, y+25, 200, 50);
            f.add(IseDsTextField);

            JLabel enterDsEse = new JLabel("Please Enter Your ESE Marks: ");
            enterDsEse.setBounds(x+440,y+25, 200,50);
            f.add(enterDsEse);

            EseDsTextField = new JTextField();
            EseDsTextField.setBounds(x+640, y+25, 200, 50);
            f.add(EseDsTextField);

            JLabel enterDsIa = new JLabel("Please Enter CA marks: ");
            enterDsIa.setBounds(x,y+75, 200,50);
            f.add(enterDsIa);

            IaDsTextField = new JTextField();
            IaDsTextField.setBounds(x+220, y+75, 200, 50);
            f.add(IaDsTextField);
        }


        {   //COA MARKS 
            y=375;
            JLabel CoaTitle = new JLabel("COA");
            CoaTitle.setBounds(x,y, 200,50);
            f.add(CoaTitle);

            JLabel enterCoaIse = new JLabel("Please Enter ISE marks: ");
            enterCoaIse.setBounds(x,y+25, 200,50);
            f.add(enterCoaIse);

            IseCoaTextField = new JTextField();
            IseCoaTextField.setBounds(x+220, y+25, 200, 50);
            f.add(IseCoaTextField);

            JLabel enterCoaEse = new JLabel("Please Enter Your ESE Marks: ");
            enterCoaEse.setBounds(x+440,y+25, 200,50);
            f.add(enterCoaEse);

            EseCoaTextField = new JTextField();
            EseCoaTextField.setBounds(x+640, y+25, 200, 50);
            f.add(EseCoaTextField);

            JLabel enterCoaIa = new JLabel("Please Enter CA marks: ");
            enterCoaIa.setBounds(x,y+75, 200,50);
            f.add(enterCoaIa);

            IaCoaTextField = new JTextField();
            IaCoaTextField.setBounds(x+220, y+75, 200, 50);
            f.add(IaCoaTextField);
        }

        
        {   //DSM MARKS
            y=500;
            JLabel DsmTitle = new JLabel("DSM");
            DsmTitle.setBounds(x,y, 200,50);
            f.add(DsmTitle);

            JLabel enterDsmIse = new JLabel("Please Enter ISE marks: ");
            enterDsmIse.setBounds(x,y+25, 200,50);
            f.add(enterDsmIse);

            IseDsmTextField = new JTextField();
            IseDsmTextField.setBounds(x+220, y+25, 200, 50);
            f.add(IseDsmTextField);

            JLabel enterEse = new JLabel("Please Enter Your ESE Marks: ");
            enterEse.setBounds(x+440,y+25, 200,50);
            f.add(enterEse);

            EseDsmTextField = new JTextField();
            EseDsmTextField.setBounds(x+640, y+25, 200, 50);
            f.add(EseDsmTextField);

            JLabel enterDsmIa = new JLabel("Please Enter CA marks: ");
            enterDsmIa.setBounds(x,y+75, 200,50);
            f.add(enterDsmIa);

            IaDsmTextField = new JTextField();
            IaDsmTextField.setBounds(x+220, y+75, 200, 50);
            f.add(IaDsmTextField);
        }


        // Creating a button and adding it to the frame.
        JButton b=new JButton("Submit");  
        b.setBounds(873,610,95,30); 
        b.addActionListener(this);

        f.add(b);
        f.setSize(1000,680);
        f.setLayout(null);
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e) 
    {
        //stores IA,ISE,ESE Marks for each subject
        int marks[][]=new int[5][3];
        
        String str="";

        //convert marks text to integer
        str=IseOopTextField.getText();
        marks[0][1]=Integer.parseInt(str);
        str=EseOopTextField.getText();
        marks[0][2]=Integer.parseInt(str)/2;
        str=IaOopTextField.getText();
        marks[0][0]=Integer.parseInt(str);

        //convert marks text to integer
        str=IseItvcTextField.getText();
        marks[1][1]=Integer.parseInt(str);
        str=EseItvcTextField.getText();
        marks[1][2]=Integer.parseInt(str)/2;
        str=IaItvcTextField.getText();
        marks[1][0]=Integer.parseInt(str);

        //convert marks text to integer
        str=IseDsTextField.getText();
        marks[2][1]=Integer.parseInt(str);
        str=EseDsTextField.getText();
        marks[2][2]=Integer.parseInt(str)/2;
        str=IaDsTextField.getText();
        marks[2][0]=Integer.parseInt(str);

        //convert marks text to integer
        str=IseCoaTextField.getText();
        marks[3][1]=Integer.parseInt(str);
        str=EseCoaTextField.getText();
        marks[3][2]=Integer.parseInt(str)/2;
        str=IaCoaTextField.getText();
        marks[3][0]=Integer.parseInt(str);

        //convert marks text to integer
        str=IseDsmTextField.getText();
        marks[4][1]=Integer.parseInt(str);
        str=EseDsmTextField.getText();
        marks[4][2]=Integer.parseInt(str)/2;
        str=IaDsmTextField.getText();
        marks[4][0]=Integer.parseInt(str);

        Student ob=new Student(roll, name, marks);
        Display.display(ob,i);
        f.dispose();
        
    }

    public static void main(String name,int num,int i) 
    {
        new accept_marks(name, num,i);
    }
}