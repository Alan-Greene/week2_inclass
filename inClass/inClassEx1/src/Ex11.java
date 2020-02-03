import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        String first_name;
        String surname;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name separated by a space: ");

        String full_name = in.nextLine();

        first_name = full_name.substring(0, full_name.indexOf(" "));
        surname = full_name.substring(full_name.indexOf(" ") + 1);
        System.out.printf("First name: %s%nSurname: %s", first_name, surname);
    }
}
