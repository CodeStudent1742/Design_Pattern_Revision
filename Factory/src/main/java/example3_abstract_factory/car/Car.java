package example3_abstract_factory.car;

abstract public class Car {
    private FuelType fuel;
    private double engineCapacity;
    private int productionYear;
    private SteeringWheelPosition steeringWheelPosition;

    public Car(FuelType fuel, double engineCapacity, int productionYear, SteeringWheelPosition steeringWheelPosition) {
        this.fuel = fuel;
        this.engineCapacity = engineCapacity;
        this.productionYear = productionYear;
        this.steeringWheelPosition = steeringWheelPosition;
    }
    public SteeringWheelPosition getSteeringWheelPosition() {
        return steeringWheelPosition;
    }
}
