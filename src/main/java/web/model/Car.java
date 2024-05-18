package web.model;

public class Car {

    private String make;

    private String model;

    private int productionYear;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.productionYear = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
}
