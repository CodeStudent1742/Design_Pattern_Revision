package example1;

import example1.chef.Chef;
import example1.chef.egg_cooker.HardBoiledEggCooker;
import example1.chef.egg_cooker.SoftBoiledEggCooker;

public class Main {

    public static void main(String[] args) {

        Chef chef = new Chef("Magda Gesler");
        chef.setEggCooker(new HardBoiledEggCooker());
        chef.cook();

        chef.setEggCooker(new SoftBoiledEggCooker());
        chef.cook();
    }

}
