
package SY_Engineering.Sem3;
public class Student_3 {
    int roll_no;
    String student_name;
    int subject_marks[] = new int[5];
    int marks;
    public Student_3(int r, String n, int[] sm) {
        this.roll_no = r;
        this.student_name = n;
        this.subject_marks = sm;
        this.marks = totalMarks();
    }
    public int totalMarks() {
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += subject_marks[i];
        }
        return total;
    }
}