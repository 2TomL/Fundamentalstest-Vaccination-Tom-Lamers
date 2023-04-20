package Opdracht_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class AnimalShelter {
    private List<Animal> animals;
    private int animalID;


    public AnimalShelter() {
        this.animalID = animalID;
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        if (!animals.contains(animal)) {
            animals.add(animal);
        }
    }

    public void printAnimals() {

        animals.forEach(System.out::println);
    }

    public void sortAnimals(Animal animal) {

        // dacht dat we deze per groep moesten sorteren, dan had ik deze eventueel in 3 lijsten kunnen plaatsen (Cat, Dog, Monkey)
//
//        if(!animals.contains(animal)){
//            animals.add(animal);
//            if (animal instanceof Cat){
//                animals.add((Cat) animal);
//            }
//        }
//        if(!animals.contains(animal)){
//            animals.add(animal);
//            if (animal instanceof Dog){
//                animals.add((Dog) animal);
//            }
//        }
//        if(!animals.contains(animal)){
//            animals.add(animal);
//            if (animal instanceof Monkey){
//                animals.add((Monkey) animal);
//            }
//        }
        animals.sort(Comparator.comparing(Animal::getAnimalNr));
    }

    public void sortAnimalsByName() {

        animals.sort(Comparator.comparing(Animal::getName));
    }

    public void sortAnimalsByAge() {

        animals.sort(Comparator.comparing(Animal::getAge));
    }

    public void printAnimalsNotVaccinated(Disease disease) {
        System.out.println("Animals not vaccinated for " + disease.name().toLowerCase() + ": ");
        animals.stream()
                .filter(animal -> !animal.getIsVaccinated().get(disease))
                .forEach(System.out::println);
    }

    public Optional<Animal> findAnimal(int animalNumber) {
        for (Animal myAnimal : animals) {
            if (myAnimal.getAnimalNr() == animalNumber) {
                return Optional.of(myAnimal);
            }
        }
        return Optional.empty();
    }
    public Optional<Animal> findAnimal(String name) {
        for (Animal myAnimal : animals) {
            if (myAnimal.getName().equals(name)) {
                return Optional.of(myAnimal);
            }
        }
        return Optional.empty();
    }

    public Animal treatAnimal(int number) {
        for (Animal animalNum : animals) {
            if (animalNum.getAnimalNr() == number) {
                animalNum.treatAnimal();
            }
        }
        return null;
    }
    public void treatAnimal(String name){
        for (Animal animalName : animals) {
            if (animalName.getName().equals(name)) {
                animalName.treatAnimal();
            }
        }
    }
    public void treatAllAnimals(){

        animals.forEach(Animal ::treatAnimal);
    }

    public Animal findOldestAnimal() {
        sortAnimalsByAge();
        return animals.get(animals.size() - 1);
    }

    public int countAnimals() {
        return animals.size();
    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "animals=" + animals +
                ", animalID=" + animalID +
                '}';
    }
}
