package example1.workshop.command;

import example1.workshop.CoffeeMaker;

public class CoffeMakerTurnOnCommand implements Command{
    private CoffeeMaker coffeeMaker;

    public CoffeMakerTurnOnCommand(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void execute() {
        coffeeMaker.turnOn();
    }

    @Override
    public void undo() {
        coffeeMaker.turnOff();
    }
}
