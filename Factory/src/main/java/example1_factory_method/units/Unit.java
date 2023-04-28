package example1_factory_method.units;

public abstract class Unit {

    private int hp;
    private int exp;
    private int dmgDone;

    protected Unit ( int hp, int exp, int dmgDone) {
        this.hp = hp;
        this.exp = exp;
        this.dmgDone = dmgDone;
    }
}
