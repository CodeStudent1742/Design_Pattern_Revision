package example1;

public class RoadDecorator extends  TerrainDecorator{


    public RoadDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int fuelCost() {
        return terrain.fuelCost()-10;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "prze który przebiega droga";
    }
}
