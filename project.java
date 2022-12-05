import java.util.Scanner;


import SY_Engineering.Sem3.input_3;

import SY_Engineering.Sem4.input_4;

public class project {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=0;
        while(n!=3)
        {
            System.out.println("Menu : ");
            System.out.println("1. Sem 3\n2. Sem 4\n3. Exit");
            n = in.nextInt();
            switch(n)
            {
                case 1: input_3.main(args);
                break;
                case 2: input_4.main(args);
                break;
                case 3: 
                    System.exit(-1);
                default:
                System.out.println("Wrong Input");
            }
        }
        
} }