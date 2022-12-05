package SY_Engineering;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Display_3 {

    public static void display(Student_3[] arr) 
    {
        
        for (Student_3 student : arr) 
        {
            System.out.println("\nRoll No: " + student.roll_no +"\nName: "+student.student_name);
            System.out.println("OOPM: "+student.sub_marks[0]);        
            System.out.println("ITVC: "+student.sub_marks[1]);        
            System.out.println("DS: "+student.sub_marks[2]);        
            System.out.println("COA: "+student.sub_marks[3]);
            System.out.println("DSM: "+student.sub_marks[4]);            
        } 
        for(int i=0;i<arr.length;i++)
        {
            JFrame f=new JFrame();
            f.setSize(1000,600);
            f.setLayout(null);
            Container c = f.getContentPane();
            c.setBackground(Color.WHITE);

            image_print(Integer.toString(i+1),f,c);
            text_labels(arr[i],f,c);
            try
            {
                BufferedImage image = new BufferedImage(1000, 600, BufferedImage.TYPE_INT_RGB);
                Graphics2D graphics2D = image.createGraphics();
                f.paint(graphics2D);
                ImageIO.write(image,"jpeg", new File("Report_Cards/image"+Integer.toString(i+1)+".jpeg"));
                f.dispose();
            }
            catch(Exception exception)
            {
            }
        }
        
    }
    protected static void text_labels(Student_3 st,JFrame f,Container c)
    {
        
        label(f,c,"Name: "+st.student_name,30,150,450,20);
        System.out.println(1);
        label(f,c,"Roll: "+Integer.toString(st.roll_no),30,175,300,20);
        System.out.println(2);
        label(f,c,"ITVC",30,200,300,30);
        // label(f,c,"IA",30,175,300,20);
        // label(f,c,"Roll",30,175,300,20);
        // label(f,c,"Roll",30,175,300,20);
        
        // String data[][]={   {"OOP",Integer.toString(st.subject_marks[0][0]),"670000"},    
        //                     {"ITVC",Integer.toString(st.subject_marks[1][0]),"780000"},
        //                     {"DS",Integer.toString(st.subject_marks[2][0]),"780000"},    
        //                     {"COA",Integer.toString(st.subject_marks[3][0]),"780000"},
        //                     {"DSM",Integer.toString(st.subject_marks[4][0]),"700000"}};  
        //                     System.out.println("OOPS"); 
        // String column[]={"Course","IA","TW"};//,"ISE","ESE","Total"};         
        // JTable jt=new JTable(data,column);    
        // jt.setBounds(30,40,200,300);   
        // // f.setVisible(true);


    }
    public static void label(JFrame f,Container c,String str,int x,int y,int w,int h)
    {
        JLabel l1 = new JLabel();
        l1.setText(str);
        l1.setBounds(x,y,w,h);
        c.add(l1);
    }
    protected static void image_print(String name,JFrame f,Container c)
    {
        

        JLabel label1=new JLabel();
        ImageIcon image1=new ImageIcon("Assets/"+name+".png");
        Image scalImage=image1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        label1.setIcon(new ImageIcon(scalImage));
        label1.setBounds(30,20,100,100);
        c.add(label1);

        JLabel label2=new JLabel();
        int w=240,h=80;
        int x=730,y=25;
        ImageIcon image2=new ImageIcon("Assets/somaiya_logo.png");
        Image scaleImage=image2.getImage().getScaledInstance(w, h, Image.SCALE_DEFAULT);
        label2.setIcon(new ImageIcon(scaleImage));
        label2.setBounds(x,y,w,h);
        c.add(label2);

        JLabel label3=new JLabel();
        w=300;
        h=120;
        x=325;
        y=5;
        ImageIcon image3=new ImageIcon("Assets/somaiya_2.png");
        Image scale2Image=image3.getImage().getScaledInstance(w, h, Image.SCALE_DEFAULT);
        label3.setIcon(new ImageIcon(scale2Image));
        label3.setBounds(x,y,w,h);
        c.add(label3);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}