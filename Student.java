package Student;

// Class for Student
public class Student {
    // Variables required to store details of a Student and all are private along with public getter and setter methods
    // variable to store prn of a student
    private int prn;

    // variable to store name of a student
    private String name;

    // variable to store date of birth of a student
    private String dob;

    // variable to store marks of a student
    private int marks;

    // Getter method for prn

    public int getPrn() {
        return prn;
    }

    //Setter method for prn
    public void setPrn(int prn) {
        this.prn = prn;
    }


    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for date of birth
    public String getDob() {
        return dob;
    }

    // Setter method for Date of Birth
    public void setDob(String dob) {
        this.dob = dob;
    }

    // Getter method for Marks
    public int getMarks() {
        return marks;
    }

    // Setter method for marks
    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Constructor with all the parameters
    Student(int prn, String name, String dob, int marks){
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }
}
