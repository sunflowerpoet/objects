/*Scrivere un programma che contenga una classe che definisce uno Studente che abbia
come proprietà nome, cognome ed identificativo.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Studente.*/
public class Esercizio01 {
    public static void main (String[] args) {
        Student student = new Student();
        student.setStudentName("Anna");
        student.setStudentLastName("Simionato");
        student.setStudentID(17122000);
        System.out.println(student.getStudentName() + " " + student.getStudentLastName() + " " + student.getStudentID());
    }
}
