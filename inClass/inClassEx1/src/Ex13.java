import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month;
        String month_output=" ";

        System.out.println("Please enter a valid month: ");
        month = in.nextInt();

        switch (month){
            case 1: month_output = "January";
                break;
            case 2: month_output = "February";
                break;
            case 3: month_output = "March";
                break;
            case 4: month_output = "April";
                break;
            case 5: month_output = "May";
                break;
            case 6: month_output = "June";
                break;
            case 7: month_output = "July";
                break;
            case 8: month_output = "August";
                break;
            case 9: month_output = "September";
                break;
            case 10: month_output = "October";
                break;
            case 11: month_output = "November";
                break;
            case 12: month_output = "December";
                break;
        }

        System.out.printf("The month you have entered is: %s", month_output);
    }
}
