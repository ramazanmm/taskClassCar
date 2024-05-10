public class Car extends Vehicle {

    public int fuelCapacity;
    public int addFuel;

    public Car(String brend, String model, int millage, int fuelCapacity, int addFuel) {
        super(brend,model, millage);
        this.fuelCapacity = fuelCapacity;
        this.addFuel = addFuel;
    }
    public int getFuel() {

        if (this.fuelCapacity > this.addFuel) {

        }
        return this.addFuel;
    }
}
