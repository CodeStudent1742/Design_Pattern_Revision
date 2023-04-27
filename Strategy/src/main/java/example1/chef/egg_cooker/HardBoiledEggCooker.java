package example1.chef.egg_cooker;

public class HardBoiledEggCooker implements EggCooker {

    @Override
    public void cookEgg() {
        System.out.println("I am cooking hard-boiled eggs");
    }
}
