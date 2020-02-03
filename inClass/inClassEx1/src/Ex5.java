import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        String name;
        int age;
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        name = in.nextLine();
        System.out.println("please enter your age: ");
        age = in.nextInt();
        System.out.printf("Your name is: %s%nYour age is: %d", name, age);
    }
}
