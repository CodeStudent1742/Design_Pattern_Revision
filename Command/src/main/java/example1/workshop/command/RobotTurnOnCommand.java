package example1.workshop.command;

import example1.workshop.Robot;

public class RobotTurnOnCommand implements Command {

    private Robot robot;

    public RobotTurnOnCommand(Robot robot) {
        this.robot = robot;
    }

    public void execute() {
        robot.turnOn();
    }

    @Override
    public void undo() {
        robot.turnOff();
    }
}
