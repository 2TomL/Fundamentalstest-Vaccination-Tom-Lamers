package Opdracht_2;

public class CrazyRobot extends Robot{

    public CrazyRobot(String unitName) {
        super(unitName);
    }

    public void boot() {
        String name = getUnitName();
        String Order = "";
        for (int index = getUnitName().length() - 1 ; index >= 0; index--) {
            Order += name.charAt(index);
        }
        System.out.println(Order);
    }
    @Override
    public String toString() {
        return "CrazyRobot{" +
                "unitName='" + unitName + '\'' +
                "} " + super.toString();
    }
}

