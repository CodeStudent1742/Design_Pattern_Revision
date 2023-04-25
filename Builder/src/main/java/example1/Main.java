package example1;

import example1.house.House;

public class Main {

    public static void main(String[] args) {

        House house = new House.HouseBuilder()
                .buildWalls("walls")
                .buildFloors("floors")
                .buildRooms("rooms")
                .buildGarage("garage")
                .build();

        System.out.println(house);
    }



}
