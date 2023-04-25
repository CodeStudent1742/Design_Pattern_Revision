package example2_classic.house;

public class SmallHouseBuilder implements HouseBuilder {
    private House house;

    public SmallHouseBuilder() {
        this.house = new House();
    }


    @Override
    public void buildWalls() {
        this.house.setWalls("small walls");
    }

    @Override
    public void buildFloors() {
        this.house.setFloors("small floors");
    }

    @Override
    public void buildRooms() {
        this.house.setRooms("small rooms");
    }

    @Override
    public void roof() {
        this.house.setRoof("small roof");
    }

    @Override
    public void windows() {
        this.house.setWindows("small windows");
    }

    @Override
    public void doors() {
        this.house.setDoors("small doors");
    }

    @Override
    public void garage() {
        this.house.setGarage("small garage");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
