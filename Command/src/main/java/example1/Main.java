package example1;

import example1.workshop.CoffeeMaker;
import example1.workshop.Robot;
import example1.workshop.WorkshopApp;
import example1.workshop.command.*;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();
        WorkshopApp workshopApp = new WorkshopApp();
        workshopApp.addToQueue(new RobotTurnOnCommand(robot));
        workshopApp.addToQueue(new RobotCutCommand(robot));
        workshopApp.addToQueue(new RobotDrillCommand(robot));
        workshopApp.addToQueue(new RobotTurnOffCommand(robot));

        workshopApp.run();

        //---------------------
        workshopApp.run();

        CoffeeMaker coffeeMaker = new CoffeeMaker();
        workshopApp.addToQueue(new CoffeMakerTurnOnCommand(coffeeMaker));
        workshopApp.addToQueue(new CoffeeMakerTurnOffCommand(coffeeMaker));
        workshopApp.run();

    }
}