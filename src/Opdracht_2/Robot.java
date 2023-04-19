package Opdracht_2;

public abstract class Robot {
    public String unitName;

    public Robot(String unitName) {
        this.unitName = unitName;
    }

    public void boot(){
        System.out.println("Robot: " + unitName + " - is POWERED UP");
    }

    public String getUnitName() {
        return unitName;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "unitName='" + unitName + '\'' +
                '}';
    }
}
