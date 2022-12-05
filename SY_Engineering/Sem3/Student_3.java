
package SY_Engineering.Sem3;
public class Student_3 {
    int roll_no;
    String student_name;
    int subject_marks[][] = new int[5][3];  //individual CA ISE ESE
    int sub_marks[]=new int[5];
    public Student_3(int r, String n, int[][] sm) {
        this.roll_no = r;
        this.student_name = n;
        this.subject_marks = sm;
        totalMarks(sm,this.sub_marks);

    }
    public void totalMarks(int subject_marks[][],int sub_marks[]) {
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