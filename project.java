import javax.swing.*;
import java.awt.event.*;

public class project implements ActionListener {
    JTextField numField;
    JFrame f = new JFrame();

    project() {
        // This is creating a new JFrame, setting the default close operation to exit on close,
        // creating a new JLabel, setting the bounds of the JLabel, creating a new JTextField, setting
        // the bounds of the JTextField, creating a new JButton, setting the bounds of the JButton, and
        // adding an action listener to the JButton.
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel enterNum = new JLabel("Number of Students: ");
        enterNum.setBounds(10, 10, 200, 50);

        numField = new JTextField();
        numField.setBounds(230, 10, 200, 50);
        JButton b = new JButton("Submit");
        b.setBounds(475, 20, 95, 30);
        b.addActionListener(this);

        // Adding the text field, the label, and the button to the frame, setting the size of the
        // frame, setting the layout to null, and making the frame visible.
        f.add(numField);
        f.add(enterNum);
        f.add(b);
        f.setSize(700, 120);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        // Getting the text from the text field, converting it to an integer, disposing of the frame,
        // setting the variable num to 0, and then looping through the number of times that the user
        // entered in the text field.
        String str = numField.getText();
        int a = Integer.parseInt(str);
        f.dispose();
        int num = 0;
        for (int j = 0; j < a; j++, num++)
            accept_name.main(num);
    }

    public static void main(String[] args) {
        new project();
    }
}