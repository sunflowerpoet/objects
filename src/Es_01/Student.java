package Es_01;

public class Student {
    private String studentName;
    private String studentLastName;
    private int studentID;

    public Student(String studentName, String studentLastName, int studentID) {
        this.studentName = studentName;
        this.studentLastName = studentLastName;
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String newStudentName) {
        this.studentName = newStudentName;
    }
    public String getStudentLastName() {
        return studentLastName;
    }
    public void setStudentLastName(String newStudentLastName) {
        this.studentLastName = newStudentLastName;
    }
    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int newID) {
        this.studentID = newID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                ", studentID=" + studentID +
                '}';
    }
}
