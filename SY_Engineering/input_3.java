package SY_Engineering;
// import javax.swing.*;
import java.util.*;

// import javax.swing.JFrame;
public class input_3 {
    static Scanner in = new Scanner(System.in);
    public static void main(String name,int roll,int [][]marks,int i) {
        
        // System.out.print("Enter how many students data to be entered : ");
        // int n = in.nextInt();
        // Student_3 studArr[] = new Student_3[n];
        // int marks[][]=new int[5][3];
        
        // for (int i = 0; i < n; i++) {
        //     System.out.print("Enter student roll no : ");
        //     int r = in.nextInt();
        //     System.out.print("Enter student name : ");
        //     String name = in.next();
        //     System.out.print("Enter student marks in OOP : ");
        //     marks_input(marks[0]);
            // System.out.print("Enter student marks in ITVC : ");
            // marks_input(marks[1]);
            // System.out.print("Enter student marks in DS : ");
            // marks_input(marks[2]);
            // System.out.print("Enter student marks in COA : ");
            // marks_input(marks[3]);
            // System.out.print("Enter student marks in DSM : ");
            // marks_input(marks[4]);
            Student_3 ob=new Student_3(roll, name, marks);
        
        Display_3.display(ob,i);
    }
    
}
