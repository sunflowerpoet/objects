package Es_02;
public class Es_02 {
    public static void main (String[] args) {
        Auto miaAuto = new Auto("Toyota", "Yaris Hybrid", 1497 , "AB123CD");

        System.out.println("Brand: " + miaAuto.getBrand());
        System.out.println("Model: " + miaAuto.getModel());
        System.out.println("Engine capacity: " + miaAuto.getEngineCapacity());
        System.out.println("Licence plate: " + miaAuto.getLicencePlate());
    }
}
