package Student;

public class Student {
    private String name;
    private String dob;
    private int prn;

    public Student(String name, String dob, int prn) {
        this.name = name;
        this.dob = dob;
        this.prn = prn;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public int getPrn() {
        return prn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setPrn(int prn) {
        this.prn = prn;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", DOB: " + dob + ", PRN: " + prn;
    }
}