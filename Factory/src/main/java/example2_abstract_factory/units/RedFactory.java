package example2_abstract_factory.units;

public class RedFactory extends Factory{
    @Override
    public InfantryUnit createInfantry(UnitType unitType) {

        switch(unitType){
            case RIFLEMAN:
                return new Rifleman(20,0,6);
            default:
                throw new UnsupportedOperationException("Unkown type");
        }
    }

    @Override
    public MechanizedUnit createMechanized(UnitType unitType) {
        switch (unitType){
            case TANK:
                return new Tank(75,0,35);
            default:
                throw new UnsupportedOperationException("Unkown type");
        }
    }
    @Override
    public AirUnit createAirUnit(UnitType unitType) {
        switch (unitType) {
            case HELICOPTER:
                return new Helicopter(20, 0, 30);
            default:
                throw new UnsupportedOperationException("Unkown type");
        }
    }
}
