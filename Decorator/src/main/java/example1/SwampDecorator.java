package example1;

public class SwampDecorator extends  TerrainDecorator{

    public SwampDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int fuelCost() {
        return terrain.fuelCost()+15;
    }
}
