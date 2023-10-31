package Es_02;
public class Auto {
    private String brand;
    private String model;
    private int engineCapacity;
    private String licencePlate;

    public Auto(String brand, String model, int engineCapacity, String licencePlate) {
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.licencePlate = licencePlate;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String newModel) {
        this.model = newModel;
    }
    public int getEngineCapacity() {
        return engineCapacity;
    }
    public void setEngineCapacity(int newEngineCapacity) {
        this.engineCapacity = newEngineCapacity;
    }
    public String getLicencePlate() {
        return licencePlate;
    }
    public void setLicencePlate(String newLicencePlate) {
        this.licencePlate = newLicencePlate;
    }
}
