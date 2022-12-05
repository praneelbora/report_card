package SY_Engineering.Sem3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Display_3 extends Canvas
{
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
    }

}