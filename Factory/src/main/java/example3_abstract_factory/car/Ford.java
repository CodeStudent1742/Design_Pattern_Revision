package example3_abstract_factory.car;

public class Ford extends Car{
    public Ford(FuelType fuel, double engineCapacity, int productionYear, SteeringWheelPosition steeringWheelPosition) {
        super(fuel, engineCapacity, productionYear, steeringWheelPosition);
    }
}
