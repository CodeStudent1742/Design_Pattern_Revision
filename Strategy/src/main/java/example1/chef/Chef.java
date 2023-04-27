package example1.chef;

import example1.chef.egg_cooker.EggCooker;

public class Chef {

    private EggCooker eggCooker;

    private String name;

    public Chef(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void cook(){
        this.eggCooker.cookEgg();
    }

    public EggCooker getEggCooker() {
        return eggCooker;
    }

    public void setEggCooker(EggCooker eggCooker) {
        this.eggCooker = eggCooker;
    }
}
