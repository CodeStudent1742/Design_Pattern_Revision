package example1.workshop.command;

import example1.workshop.Robot;

public class RobotCutCommand implements Command{

    Robot robot;

    public RobotCutCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void undo() {
    }

    @Override
    public void execute() {
        robot.cut();
    }
}
