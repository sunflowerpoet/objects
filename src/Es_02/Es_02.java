package Es_02;
/*
Scrivere un programma che contenga una classe che definisce un Auto
che abbia come proprietà cilindrata, targa, marca e modello.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Auto.
*/

public class Es_02 {
    public static void main (String[] args) {
        Auto miaAuto = new Auto("Toyota", "Yaris Hybrid", 1497 , "AB123CD");

        System.out.println("Brand: " + miaAuto.getBrand());
        System.out.println("Model: " + miaAuto.getModel());
        System.out.println("Engine capacity: " + miaAuto.getEngineCapacity());
        System.out.println("Licence plate: " + miaAuto.getLicencePlate());
    }
}
