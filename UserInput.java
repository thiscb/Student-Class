package Student;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student date of birth (yyyy-mm-dd): ");
        String dobString = scanner.nextLine();
        String dob = new String(dobString);

        System.out.print("Enter student PRN: ");
        int prn = scanner.nextInt();

        Student student = new Student(name, dob, prn);
        System.out.println("Student added successfully: " + student);
    }
}