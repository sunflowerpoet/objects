package Es_03;

public class CarDetails {
    private String brand;
    private String model;
    private int engineCapacity;
    private String licencePlate;

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
    @Override
    public String toString() {
        return "CarDetails{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", licencePlate='" + licencePlate + '\'' +
                '}';
    }
}
