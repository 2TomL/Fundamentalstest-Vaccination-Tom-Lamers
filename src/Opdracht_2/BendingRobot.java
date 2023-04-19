package Opdracht_2;

public class BendingRobot extends Robot{
    private double maxBendAngle;

    public BendingRobot(String unitName, double maxBendAngle) {
        super(unitName);
        this.maxBendAngle = maxBendAngle;
    }

    public void bend(double bendAngle) {
        if (bendAngle > maxBendAngle) {
            System.out.println("Bending NOT possible: " + maxBendAngle);
        } else {
            System.out.println("Bent angle is: " + bendAngle);
        }
    }

    @Override
    public String toString() {
        return "BendingRobot{" +
                "maxBendAngle=" + maxBendAngle +
                '}';
    }
}