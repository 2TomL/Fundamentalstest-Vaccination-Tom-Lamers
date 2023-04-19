package Opdracht_1;

import java.util.HashMap;
import java.util.Map;

public abstract class Animal implements Treatable,Vaccinateable{
    private boolean isClean;
    private int age;
    private String name;
    private int animalNr;
    private Map<Disease, Boolean> isVaccinated;

    {
        isVaccinated = new HashMap<>();
        Disease[] diseases = Disease.values();

        for (Disease disease : diseases) {
            isVaccinated.put(disease, false);
        }
    }

    public Animal() {
        this.name = "No name";
    }

    public Animal(boolean isClean, int age, String name, int animalNr) {
        this.isClean = isClean;
        this.age = age;
        this.name = name;
        this.animalNr = animalNr;
    }

        public void setClean ( boolean clean){
        isClean = clean;
        }

        public int getAge () {
            return age;
        }

        public String getName () {
            return name;
        }

        public int getAnimalNr () {
            return animalNr;
        }

        public void setAnimalNr ( int animalNr){
        this.animalNr = animalNr;
        }

        public Map<Disease, Boolean> getIsVaccinated () {
            return isVaccinated;
        }

    @Override
    public void vaccinateAnimal(Disease disease) {
        isVaccinated.replace(disease, true);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "isClean=" + isClean +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", animalNr=" + animalNr +
                ", isVaccinated=" + isVaccinated +
                '}';
    }
}