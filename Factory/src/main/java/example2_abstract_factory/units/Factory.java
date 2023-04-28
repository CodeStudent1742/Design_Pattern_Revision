package example2_abstract_factory.units;

public abstract class Factory {
    abstract public InfantryUnit createInfantry(UnitType unitType);
    abstract public MechanizedUnit createMechanized(UnitType unitType);

    abstract public AirUnit createAirUnit(UnitType unitType);

}
