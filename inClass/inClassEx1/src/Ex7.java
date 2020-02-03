import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        final String SURNAME = "Greene";
        Scanner in = new Scanner(System.in);
        System.out.print("Please ever your surname: ");
        String surname = in.nextLine();

        if (surname.equals(SURNAME)){
            System.out.printf("Surname: %s, was entered correctly", surname);
        } else {
            System.out.println("The surname was entered incorrectly");
        }
    }
}
