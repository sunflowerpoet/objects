package Es_01;
public class Es_01 {
    public static void main (String[] args) {
        Student student = new Student("Anna", "Simionato", 17122000);

        System.out.println("Student name: " + student.getStudentName());
        System.out.println("Student last name: " + student.getStudentLastName());
        System.out.println("Student identification: " + student.getStudentID());
    }
}
