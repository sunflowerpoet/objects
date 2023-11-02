package Es_03;
/*Scrivere un programma che contenga una classe che definisce un Auto
che abbia come proprietà cilindrata, targa, marca e modello.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Auto.
In questo caso la nota importante è rendere le proprietà della classe auto accessibili solo attraverso i metodi*/
public class Es_03 {
    public static void main (String[] args) {
     System.out.println("MY CAR DETAILS:");

     CarDetails car = new CarDetails();

     car.setBrand("Toyota");
     car.setModel("Yaris Hybrid");
     car.setEngineCapacity(1469);
     car.setLicencePlate("AB123CD");

     System.out.println("Brand: " + car.getBrand());
     System.out.println("Model: " + car.getModel());
     System.out.println("Engine capacity: " + car.getEngineCapacity());
     System.out.println("Licence plate: " + car.getLicencePlate());
    }
}

// NON SONO SICURA AL 100% DI AVERERE FATTO L'ESERCIZIO GIUSTO,IN QUANTO NON PENSO DI AVERE CAPITO MOTLO BENE LA PARTE
// DEL RENDERE ACCESSIBILI LE PROPRIETA ATTRAVERSO I METODI. SPERO COMUQNUE DI AVERE CAPITO ALMENO IL PRINCIPIO :)
