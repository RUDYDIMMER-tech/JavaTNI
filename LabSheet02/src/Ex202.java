import java.util.Scanner;

public class Ex202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student-id: ");
        String id = scanner.next();

        scanner.nextLine();
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.println();
        System.out.println("Student-id: " + id);
        System.out.println("Student-id: " + name);
    }
}
