package example1.templateMethod;

public abstract class CarStartingSequence {

    public final void startTheCar(){
        fastenSeatbelts();
        startTheIgniotion();
        setTheGear();
        go();
    }
    private void go() {
        System.out.println("Wciskamy pedał gazu");
    }
    private void fastenSeatbelts() {
        System.out.println("Zapinamy pasek");
    }
    public abstract void setTheGear() ;
    public abstract void startTheIgniotion() ;
}
