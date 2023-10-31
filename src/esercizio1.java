/*Scrivere un programma che contenga una classe che definisce uno Studente che abbia
come proprietà nome, cognome ed identificativo.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Studente.*/
public class esercizio1 {
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
    public static void main (String[] args) {
        esercizio1 student = new esercizio1();
        student.setStudentName("Anna");
        student.setStudentLastName("Simionato");
        student.setStudentID(17122000);
        System.out.println(student.getStudentName() + " " + student.getStudentLastName() + " " + student.getStudentID());
    }
}
