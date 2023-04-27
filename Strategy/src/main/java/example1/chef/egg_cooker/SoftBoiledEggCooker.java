package example1.chef.egg_cooker;

public class SoftBoiledEggCooker implements EggCooker {

    @Override
    public void cookEgg() {
        System.out.println("I am cooking soft-boiled eggs");
    }
}
