package SY_Engineering.Sem4;
import java.util.*;
public class input_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter how many students data to beentered : ");
        int n = in.nextInt();
        Student_4 studArr[] = new Student_4[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student roll no : ");
            int r = in.nextInt();
            System.out.print("Enter student name : ");
            String name = in.next();
            System.out.print("Enter student marks in OOP : ");
            int mark1 = in.nextInt();
            System.out.print("Enter student marks in ITVC : ");
            int mark2 = in.nextInt();
            System.out.print("Enter student marks in DS : ");
            int mark3 = in.nextInt();
            System.out.print("Enter student marks in COA : ");
            int mark4 = in.nextInt();
            System.out.print("Enter student marks in DSM : ");
            int mark5 = in.nextInt();
            int arr[] = { mark1, mark2, mark3 ,mark4,mark5};
            studArr[i] = new Student_4(r, name, arr);
        }
        in.close();

    }
}
