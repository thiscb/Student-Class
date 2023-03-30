package Student;


//Importing Scanner class in java.util package to read input from prompt
import java.util.Scanner;

//Only public Main Class
public class Main {
    //Declaring array to store input student details from user
    static Student[] students;
    //Main method
    public static void main(String[] args) {
        // Variable for do while loop
        int count;

        // Do-While loop to iterate menu
        do {
            // Displaying Menu
            System.out.println("1. Add Students");
            System.out.println("2. Display");
            System.out.println("3. Search(by prn)");
            System.out.println("4. Search(by name)");
            System.out.println("5. Search(by position)");
            System.out.println("6. Edit Details");
            System.out.println("7. Delete");

            // Scanner object to read choice from prompt
            Scanner sc = new Scanner(System.in);

            // variable to store choice from menu
            int choice;

            // Taking choice input from prompt
            choice = sc.nextInt();

            // Creating object of class Operations
            Operations operate = new Operations();

            // Switch Case for menu
            switch (choice) {

                // Case to call method search by prn
                case 3:
                    operate.searchByPrn(students);

                    // Break to get out of the switch case
                    break;

                // Case to call method search by name
                case 4:
                    int index = operate.searchByName(students);

                    // Break to get out of the switch case
                    break;

                // Case to call method search by index
                case 5:
                    operate.searchByIndex(students);

                    // Break to get out of the switch case
                    break;

                // Case to edit details
                case 6:
                    students = operate.edit(students);
                    operate.displayStudents(students);
                    break;

                // Case to edit student details in array
                case 7:
                    students = operate.delete(students);
                    operate.displayStudents(students);
                    break;

                // Case to call method tp add student details
                case 1:

                    // Storing Added Details in students array
                    students = operate.addStudent(students);

                    // Case to call method to display all stored details
                case 2:
                default:
                    operate.displayStudents(students);

                    // Break to get out of the switch case
                    break;
            }

            // Asking user if he/she wants to continue this menu
            System.out.println("Do you want to perform more operations?(Y=1|N=0): ");

            // Storing reply in count variable
            count = sc.nextInt();
        }while(count == 1); // While condition for do while loop
    }
}
