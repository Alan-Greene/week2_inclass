import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        String name = "Alan";
        String surname = "Greene";

        String initials = name.charAt(0) + "." + surname.charAt(0) + ".";
        System.out.printf("%s", initials);
    }
}
