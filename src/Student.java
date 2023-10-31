public class Student {
    private String studentName;
    private String studentLastName;
    private int studentID;

    public String getStudentName() {
        return studentName;
    }
    public String getStudentLastName() {
        return studentLastName;
    }
    public int getStudentID() {
        return studentID;
    }
    public void setStudentName(String newName) {
        this.studentName = newName;
    }
    public void setStudentLastName(String newLastName) {
        this.studentLastName = newLastName;
    }
    public void setStudentID(int newID) {
        this.studentID = newID;
    }
}
