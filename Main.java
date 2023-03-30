package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<Student> students;

    public Main() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void displayStudents() {
        if (students.size() == 0) {
            System.out.println("No students found!");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void searchStudentByPrn(String prn) {
        boolean found = false;
        for (Student student : students) {
            if (Integer.parseInt(prn)==student.getPrn()) {
                System.out.println(student);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No student found with PRN " + prn);
        }
    }

    public void searchStudentByName(String name) {
        boolean found = false;
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println(student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No student found with name " + name);
        }
    }

    public void editStudent(String prn) {
        boolean found = false;
        for (Student student : students) {
            if (Integer.parseInt(prn)==student.getPrn()) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter new name for the student:");
                String name = scanner.nextLine();
                System.out.println("Enter new date of birth for the student (yyyy-mm-dd):");
                String dob = scanner.nextLine();
                student.setName(name);
                student.setDob(dob);
                System.out.println("Student information updated successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No student found with PRN " + prn);
        }
    }

    public void deleteStudent(String prn) {
        boolean found = false;
        for (Student student : students) {
            if (Integer.parseInt(prn)==student.getPrn()) {
                students.remove(student);
                System.out.println("Student deleted successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No student found with PRN " + prn);
        }
    }
}