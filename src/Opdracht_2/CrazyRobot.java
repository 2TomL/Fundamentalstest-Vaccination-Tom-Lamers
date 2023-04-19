package Opdracht_2;

public class CrazyRobot extends Robot{

    public CrazyRobot(String unitName) {
        super(unitName);
    }

    public void boot() {
        String name = getUnitName();
        StringBuilder reversedName = new StringBuilder(name).reverse();
        System.out.println(reversedName.toString());
    }

    @Override
    public String toString() {
        return "CrazyRobot{" +
                "unitName='" + unitName + '\'' +
                "} " + super.toString();
    }
}

