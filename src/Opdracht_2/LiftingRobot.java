package Opdracht_2;

public class LiftingRobot extends Robot{
    private double maxLiftHeight;

    public LiftingRobot(String unitName, double maxLiftHeight) {
        super(unitName);
        this.maxLiftHeight = maxLiftHeight;
    }

    public void lift(double liftHeight) {
        if (liftHeight > maxLiftHeight) {
            System.out.println("lifting NOT possible: " + maxLiftHeight);
        } else {
            System.out.println("Robot lifting height: " + liftHeight);
        }
    }
    @Override
    public String toString() {
        return "LiftingRobot{" +
                "maxLiftHeight=" + maxLiftHeight +
                '}';
    }
}