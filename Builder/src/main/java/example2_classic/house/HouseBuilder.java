package example2_classic.house;

public interface HouseBuilder {
    void buildWalls();
    void buildFloors();
    void buildRooms();
    void roof();
    void windows();
    void doors();
    void garage();

    House getHouse();
}
