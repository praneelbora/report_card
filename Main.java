import javax.swing.*;

// import SY_Engineering.Student_3;
// import SY_Engineering.input_3;
import java.awt.event.*;

public class Main implements ActionListener{
    JTextField tf1,tf2,tf3, nameTextField;
    JButton b1,b2;
    
    Main(){
        JFrame f= new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        int marks[][]=new int[5][4];
        JLabel enterName = new JLabel("Please Enter Your Name: ");
        enterName.setBounds(10,10, 200,50);
        f.add(enterName);

        JTextField nameTextField = new JTextField();
        nameTextField.setBounds(230, 10, 200, 50);
        f.add(nameTextField);

        JLabel enterRoll = new JLabel("Please Enter Your Roll Number: ");
        enterRoll.setBounds(450,10, 200,50);
        f.add(enterRoll);

        JTextField rollTextField = new JTextField();
        rollTextField.setBounds(650, 10, 200, 50);
        f.add(rollTextField);

        JLabel enterBatch = new JLabel("Please Enter Your Batch Number: ");
        enterBatch.setBounds(10,60, 220,50);
        f.add(enterBatch);

        JTextField batchTextField = new JTextField();
        batchTextField.setBounds(230, 60, 200, 50);
        f.add(batchTextField);


        // //        ITVC Marks

        // JLabel itvcTitle = new JLabel("ITVC");
        // itvcTitle.setBounds(10,110, 200,50);
        // f.add(itvcTitle);

        // JLabel enterIseItvc = new JLabel("Please Enter ISE marks: ");
        // enterIseItvc.setBounds(10,160, 200,50);
        // f.add(enterIseItvc);

        // JTextField IseItvcTextField = new JTextField();
        // IseItvcTextField.setBounds(230, 160, 200, 50);
        // f.add(IseItvcTextField);

        // JLabel enterEseItvc = new JLabel("Please Enter Your ESE Marks: ");
        // enterEseItvc.setBounds(450,160, 200,50);
        // f.add(enterEseItvc);

        // JTextField EseItvcTextField = new JTextField();
        // EseItvcTextField.setBounds(650, 160, 200, 50);
        // f.add(EseItvcTextField);

        // JLabel enterIaItvc = new JLabel("Please Enter IA marks: ");
        // enterIaItvc.setBounds(10,210, 200,50);
        // f.add(enterIaItvc);

        // JTextField IaItvcTextField = new JTextField();
        // IaItvcTextField.setBounds(230, 210, 200, 50);
        // f.add(IaItvcTextField);

        // JLabel enterTermItvc = new JLabel("Please Enter Your TW marks: ");
        // enterTermItvc.setBounds(450,210, 200,50);
        // f.add(enterTermItvc);

        // JTextField TermItvcTextField = new JTextField();
        // TermItvcTextField.setBounds(650, 210, 200, 50);
        // f.add(TermItvcTextField);
        // marks[0][0]=Integer.parseInt(IseItvcTextField.getText());
        // marks[0][1]=Integer.parseInt(IaItvcTextField.getText());
        // marks[0][2]=Integer.parseInt(TermItvcTextField.getText());
        // marks[0][3]=Integer.parseInt(EseItvcTextField.getText());
        
        moremarks("ITVC",marks[1],f,1,1);
        moremarks("DS",marks[1],f,1,1);
        //  DS Marks
        
        // Student_3 st=new Student_3((Integer.parseInt(rollTextField.getText())),(nameTextField.getText()), marks));


       tf1=new JTextField();
       tf1.setBounds(50,50,150,20);

//
       tf2=new JTextField();
       tf2.setBounds(50,100,150,20);


       tf3=new JTextField();
       tf3.setBounds(50,150,150,20);
       tf3.setEditable(false);

       b1=new JButton("+");
       b1.setBounds(50,200,50,50);
       b2=new JButton("-");
       b2.setBounds(120,200,50,50);
       b1.addActionListener(this);
       b2.addActionListener(this);



    //    l2.setBounds(350,300, 100,30);
    //    f.add(l1); f.add(l2);

       f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);f.add(b2);
        f.setSize(1000,600);
        f.setLayout(null);
        f.setVisible(true);

    }
    public void moremarks(String subject,int marks[],JFrame f,int x,int y)
    {
        JLabel Title = new JLabel(subject);
        Title.setBounds(10,110, 200,50);
        f.add(Title);

        JLabel enterIse = new JLabel("Please Enter ISE marks: ");
        enterIse.setBounds(10,160, 200,50);
        f.add(enterIse);

        JTextField IseTextField = new JTextField();
        IseTextField.setBounds(230, 160, 200, 50);
        f.add(IseTextField);

        JLabel enterEse = new JLabel("Please Enter Your ESE Marks: ");
        enterEse.setBounds(450,160, 200,50);
        f.add(enterEse);

        JTextField EseTextField = new JTextField();
        EseTextField.setBounds(650, 160, 200, 50);
        f.add(EseTextField);

        JLabel enterIa = new JLabel("Please Enter IA marks: ");
        enterIa.setBounds(10,210, 200,50);
        f.add(enterIa);

        JTextField IaTextField = new JTextField();
        IaTextField.setBounds(230, 210, 200, 50);
        f.add(IaTextField);

        JLabel enterTerm = new JLabel("Please Enter Your TW marks: ");
        enterTerm.setBounds(450,210, 200,50);
        f.add(enterTerm);

        JTextField TermTextField = new JTextField();
        TermTextField.setBounds(650, 210, 200, 50);
        f.add(TermTextField);


    }
    public void actionPerformed(ActionEvent e) {
        String s1=tf1.getText();
        String s2=tf2.getText();
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=0;
        if(e.getSource()==b1){
            c=a+b;
        }else if(e.getSource()==b2){
            c=a-b;
        }
        String result=String.valueOf(c);
        tf3.setText(result);
        System.out.println(tf3.getText());
    }
    public static void main(String[] args) {
        new Main();
    } }