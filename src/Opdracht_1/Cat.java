package Opdracht_1;

import java.util.Map;

public class Cat extends Animal{
    private boolean hasLongNails;

    public Cat(){
        this.hasLongNails = false;
    }

    public Cat(boolean isClean, int age, String name, int animalNr, boolean hasLongNails) {
        super(isClean, age, name, animalNr);
        this.hasLongNails = hasLongNails;
    }

    public boolean isHasLongNails() {

        return hasLongNails;
    }

    public void setHasLongNails(boolean hasLongNails) {

        this.hasLongNails = hasLongNails;
    }

    @Override
    public void treatAnimal() {
        setClean(true);
        hasLongNails = false;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "hasLongNails=" + hasLongNails +
                "} " + super.toString();
    }
}
