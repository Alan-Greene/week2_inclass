package inclassex1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the gpa grade: ");
        double gpa = in.nextDouble();
        String award;

        if (gpa >= 2.5){
            award = "Merit";
        } else if (gpa >= 2 && gpa < 2.5){
            award = "Pass";
        } else {
            award = "Fail";
        }

        System.out.printf("The grade awarded was: %s", award);
    }
}
