package SY_Engineering.Sem3;
public class Marks_3 {
    public static void display(Student_3[] arr) 
    {
        for (Student_3 student : arr) 
        {
            System.out.println("Roll No: " + student.roll_no +"\nName: " + student.student_name + "\nOOP marks: "+ student.subject_marks[0] + "\nMath marks: " +student.subject_marks[1] + "\nDS marks: "+ student.subject_marks[2] + "\nTotal marks: "+ student.marks);
        } 
    }
    public static void sort(Student_3[] arr) 
    {
        int index = 0;
        int t1[] = { 0, 0, 0 };
        Student_3 temp1 = new Student_3(0, "null", t1);
        for (int i = 0; i < arr.length; i++) 
        {
            int t = 10000;
            for (int j = i; j < arr.length; j++) {
                if (arr[j].marks <= t) 
                {
                    t = arr[j].marks;
                    index = j; 
                }
            }
            temp1 = arr[index];
            arr[index] = arr[i];
            arr[i] = temp1;
        } 
    }
}