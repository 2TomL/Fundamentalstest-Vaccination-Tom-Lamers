package Opdracht_2.App;

import Opdracht_2.BendingRobot;
import Opdracht_2.CrazyRobot;
import Opdracht_2.LiftingRobot;
import Opdracht_2.Robot;

public class RobotApp {
    public static void main(String[] args) {

        RobotApp myRobotApp = new RobotApp();
        CrazyRobot crazyRobot1 = new CrazyRobot("CrazyRobot1");
        BendingRobot bendingRobot1 = new BendingRobot("BendingRobot1", 45.0);
        LiftingRobot liftingRobot1 = new LiftingRobot("Lifterke",2.60);

        crazyRobot1.boot();
        bendingRobot1.bend(60.0);
        bendingRobot1.bend(30.0);
        liftingRobot1.lift(1.60);
        liftingRobot1.lift(3.50);
    }
}
