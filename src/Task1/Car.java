package Task1;

public class Car extends Vehicle {
    private int numDoors;
    private boolean isElectric;

    public Car(String brand, int year, int numDoors, boolean isElectric) {
        super(brand, year);
        this.numDoors = numDoors;
        this.isElectric = isElectric;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public boolean isElectric() {
        return isElectric;
    }
    public void drive() {
        System.out.println("Car is driving");
    }
    public void park() {
        System.out.println("Car is parking");
    }
}
