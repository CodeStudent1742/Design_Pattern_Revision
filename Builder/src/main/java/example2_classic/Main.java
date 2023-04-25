package example2_classic;

import example2_classic.house.BigHouseBuilder;
import example2_classic.house.House;
import example2_classic.house.HouseDirector;
import example2_classic.house.SmallHouseBuilder;

public class Main {

    public static void main(String[] args) {

        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();

        HouseDirector smallhouseDirector = new HouseDirector(smallHouseBuilder);
        smallhouseDirector.buildHouse();

        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);
        bigHouseDirector.buildHouse();

        House smallHouse = smallhouseDirector.getHouse();
        House bigHouse = bigHouseBuilder.getHouse();

        System.out.println(smallHouse);
        System.out.println(bigHouse);

    }


}
