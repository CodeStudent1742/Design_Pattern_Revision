package example2_abstract_factory.units;

public class BlueFactory extends Factory{
    @Override
    public InfantryUnit createInfantry(UnitType unitType) {

        switch(unitType){
            case RIFLEMAN:
                return new Rifleman(25,0,5);
            default:
                throw new UnsupportedOperationException("Unkown type");
        }
    }

    @Override
    public MechanizedUnit createMechanized(UnitType unitType) {
        switch (unitType) {
            case TANK:
                return new Tank(100, 0, 25);
            default:
                throw new UnsupportedOperationException("Unkown type");
        }
    }

    @Override
    public AirUnit createAirUnit(UnitType unitType) {
        switch (unitType) {
            case HELICOPTER:
                return new Helicopter(50, 0, 25);
            default:
                throw new UnsupportedOperationException("Unkown type");
        }
    }
}
