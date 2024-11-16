package Task1;

public class Honda extends Car {
    private String model;
    private String color;

    public Honda(String brand, int year, int numDoors, boolean isElectric, String model, String color) {
        super(brand, year, numDoors, isElectric);
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
    public void accelerate() {
        System.out.println("Honda is accelerating");
    }
    public void brake() {
        System.out.println("Honda is braking");
    }


}
