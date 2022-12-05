package SY_Engineering;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Display {
    public static void display(Student ob, int i) {
        JFrame f = new JFrame();
        f.setSize(1000, 680);
        f.setLayout(null);
        Container c = f.getContentPane();
        c.setBackground(Color.WHITE);

        image_print(Integer.toString(i + 1), f, c);
        text_labels(ob, f, c);
        f.setVisible(true);

        try {
            // saves the report card as a jpeg
            BufferedImage image = new BufferedImage(1000, 680, BufferedImage.TYPE_INT_RGB);
            Graphics2D graphics2D = image.createGraphics();
            f.paint(graphics2D);
            ImageIO.write(image, "jpeg", new File("Report_Cards/ReportCard_" + ob.roll_no + ".jpeg"));
            Thread.sleep(1000);
            f.dispose();
        } catch (Exception exception) {
        }
    }

    protected static void text_labels(Student st, JFrame f, Container c) {

        labelBold(f, c, "Name: " + st.student_name, 210, 150, 450, 30, 25);
        labelBold(f, c, "Roll: " + Integer.toString(st.roll_no), 210, 190, 300, 30, 25);
        String sub[] = { "OOP : ", "ITVC : ", "DS : ", "COA : ", "DSM : " };
        String sec[] = { " IA", "ISE", "ESE", " Total", "CGPA" };
        String max[] = { " / 20", " / 30", " / 50", " / 100", " / 10" };
        String CGPA[] = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "10", "10" };
        for (int i = 0; i < 5; i++) {
            int x = 200 + (100 * i);
            labelBold(f, c, sec[i], x, 250, 300, 30, 18);
        }
        label(f, c,
                "_____________________________________________________",
                180, 275, 350, 30);
        label(f, c,
                "______________________________________________",
                360, 275, 310, 30);
        float cgp = 0;
        for (int i = 0; i < 5; i++) {
            int y = (250 + (60 * (i + 1)));
            labelBold(f, c, sub[i], 80, y, 300, 30, 20);
            for (int j = 0; j < 3; j++) {
                int x = 195 + (100 * j);
                labelBold(f, c, Integer.toString(st.subject_marks[i][j]) + max[j], x, y, 300, 30, 18);
            }

            cgp += Float.parseFloat(CGPA[st.sub_marks[i] / 10]);
            labelBold(f, c, Integer.toString(st.sub_marks[i]) + max[3], 500, y, 500, 30, 18);
            labelBold(f, c, CGPA[st.sub_marks[i] / 10] + max[4], 600, y, 500, 30, 18);
            label(f, c,
                    "_____________________________________________________",
                    60, y + 25, 350, 30);
            label(f, c,
                    "______________________________________________",
                    360, y + 25, 350, 30);
        }
        float avgCGPA = cgp / 5;
        labelBold(f, c, "Final CGPA", 750, 350, 250, 35, 30);
        labelBold(f, c, Float.toString(avgCGPA) + max[4], 790, 400, 250, 35, 30);

    }

    public static void labelBold(JFrame f, Container c, String str, int x, int y, int w, int h, int s) {
        JLabel l1 = new JLabel();
        l1.setText(str);
        l1.setBounds(x, y, w, h);
        l1.setFont(new Font("Serif", Font.BOLD, s));
        c.add(l1);
    }

    public static void label(JFrame f, Container c, String str, int x, int y, int w, int h) {
        JLabel l1 = new JLabel();
        l1.setText(str);
        l1.setBounds(x, y, w, h);
        c.add(l1);
    }

    protected static void image_print(String name, JFrame f, Container c) {

        JLabel label1 = new JLabel();
        ImageIcon image1 = new ImageIcon("Assets/" + name + ".png");
        Image scalImage = image1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        label1.setIcon(new ImageIcon(scalImage));
        label1.setBounds(40, 150, 120, 120);
        c.add(label1);

        JLabel label2 = new JLabel();
        int w = 240, h = 80;
        int x = 675, y = 30;
        ImageIcon image2 = new ImageIcon("Assets/somaiya_1.png");
        Image scaleImage = image2.getImage().getScaledInstance(w, h, Image.SCALE_DEFAULT);
        label2.setIcon(new ImageIcon(scaleImage));
        label2.setBounds(x, y, w, h);
        c.add(label2);

        JLabel label3 = new JLabel();
        w = 450;
        h = 120;
        x = 50;
        y = 5;
        ImageIcon image3 = new ImageIcon("Assets/somaiya_2.png");
        Image scale2Image = image3.getImage().getScaledInstance(w, h, Image.SCALE_DEFAULT);
        label3.setIcon(new ImageIcon(scale2Image));
        label3.setBounds(x, y, w, h);
        c.add(label3);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}