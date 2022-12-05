
package SY_Engineering.Sem4;
public class Student_4 {
    int roll_no;
    String student_name;
    int subject_marks[] = new int[3];
    int marks;
    public Student_4(int r, String n, int[] sm) {
        this.roll_no = r;
        this.student_name = n;
        this.subject_marks = sm;
        this.marks = totalMarks();
    }
    public int totalMarks() {
        int total = 0;
        for (int i = 0; i < 3; i++) {
            total += subject_marks[i];
        }
        return total;
    }
}