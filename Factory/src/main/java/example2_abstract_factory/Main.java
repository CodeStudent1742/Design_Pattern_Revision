package example2_abstract_factory;

import example2_abstract_factory.units.*;

public class Main {
    public static void main(String[] args) {

        Factory blueFactory = new BlueFactory();
        Factory redFactory = new RedFactory();

        InfantryUnit redInfantry = redFactory.createInfantry(UnitType.RIFLEMAN);
        MechanizedUnit redTank = redFactory.createMechanized(UnitType.TANK);

        InfantryUnit blueInfantry = blueFactory.createInfantry(UnitType.RIFLEMAN);
        MechanizedUnit blueTank = blueFactory.createMechanized(UnitType.TANK);

        AirUnit blueHelicopter = blueFactory.createAirUnit(UnitType.HELICOPTER);
        AirUnit redHelicopter = redFactory.createAirUnit(UnitType.HELICOPTER);
    }
}
