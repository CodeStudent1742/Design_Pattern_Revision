package example1_factory_method;

import example1_factory_method.units.Factory;
import example1_factory_method.units.Unit;
import example1_factory_method.units.UnitFactory;
import example1_factory_method.units.UnitType;

public class Main {
    public static void main(String[] args) {
        Factory factory = new UnitFactory();
        Unit tank = factory.createUnit(UnitType.TANK);
        Unit rifleman = factory.createUnit(UnitType.RIFLEMAN);
    }
}
