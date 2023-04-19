package Opdracht_1;

import java.util.Map;

public class Monkey extends Animal{
    private boolean isHyperActive;
    public Monkey(){
        this.isHyperActive = false;
    }

    public Monkey(boolean isClean, int age, String name, int animalNr, boolean isHyperActive) {
        super(isClean, age, name, animalNr);
        this.isHyperActive = isHyperActive;
    }

    @Override
    public void treatAnimal() {
        setClean(true);
        isHyperActive = false;
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "isHyperActive=" + isHyperActive +
                "} " + super.toString();
    }
}
