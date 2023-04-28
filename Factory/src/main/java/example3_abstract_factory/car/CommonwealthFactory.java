package example3_abstract_factory.car;

public class CommonwealthFactory implements Factory {
    SteeringWheelPosition position = SteeringWheelPosition.RIGHT;


    public Car buildFord(FordModel model) {
        switch(model) {
            case CMAX:
                return new Ford(FuelType.DIESEL,1.8,2023, position);
            case FOCUS:
                return new Ford(FuelType.BENZIN,1.6, 2023, position);
            default:
                throw new IllegalArgumentException("Unknown model");
        }
    }

    public Car buildBMW(BMWModel model) {
        switch (model) {
            case X5:
                return new BMW(FuelType.DIESEL,1.8,2023, position);
            case E60:
                return new BMW(FuelType.BENZIN,1.6, 2023, position);
            default:
                throw new IllegalArgumentException("Unknown model");
        }
    }
}
