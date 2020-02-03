import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String manager;
        String event;
        String newLine = System.getProperty("line.separator");
        System.out.println("Which event would you like to host?" + newLine + "1) Private" + newLine + "2) Corporate");
        int choice = in.nextInt();

        if (choice == 1){
            manager = "C. Larman";
            event = "Private";
        } else if (choice == 2){
            manager = "Ken Bass";
            event = "Corporate";
        } else {
            System.out.println("input error");
            manager = "-";
            event = "-";
        }

        System.out.printf("The manager for the event is: %s%nThe event type is: %s", manager, event);
    }
}
