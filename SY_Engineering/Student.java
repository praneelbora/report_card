package SY_Engineering;


public class Student {
    // The constructor of the class Student. It takes the roll number, name and marks of the student as
    // input and stores them in the respective variables.
    int roll_no;
    String student_name;
    int subject_marks[][] = new int[5][3];  //individual CA ISE ESE
    int sub_marks[]=new int[5];
    public Student(int roll, String name, int[][] sm) {
        this.roll_no = roll;
        this.student_name = name;
        this.subject_marks = sm;
        totalMarks(sm,this.sub_marks);

    }
    /**
     * It takes a 2D array of integers as input and returns an array of integers
     * subject_marks --> This is a 2D array that stores the marks of each student in each subject.
     * sub_marks --> This is the array that will store the total marks of each subject.
     */
    private void totalMarks(int subject_marks[][],int sub_marks[]) {
        for (int i = 0; i < 5; i++) 
        {
            int total = 0;
            for(int j=0;j<3;j++)
            {
                total += subject_marks[i][j];
            }
            sub_marks[i] = total;
        }
    }
}