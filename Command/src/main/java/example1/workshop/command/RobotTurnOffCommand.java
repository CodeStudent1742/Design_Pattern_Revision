package example1.workshop.command;

import example1.workshop.Robot;

public class RobotTurnOffCommand implements Command{

    private Robot robot;

    public RobotTurnOffCommand(Robot robot) {
        this.robot = robot;
    }
    public void execute() {
        robot.turnOff();
    }

    @Override
    public void undo() {
        robot.turnOn();
    }
}
