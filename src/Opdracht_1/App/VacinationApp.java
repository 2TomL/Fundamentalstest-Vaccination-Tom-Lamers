package Opdracht_1.App;

import Opdracht_1.*;

import java.util.Scanner;

import static Opdracht_1.Disease.CHICKENPOCKS;

public class VacinationApp {
    public static void main(String[] args) {

        AnimalShelter myShelter = new AnimalShelter();

        Cat cat1 = new Cat(false, 22, "krabke",1,false);
        Cat cat2 = new Cat(false,11,"fluffy",2, true);
        Cat cat3 = new Cat(false,12, "scratcherke",3, true);
        Dog dog1 = new Dog(true,6,"roefke",4,false);
        Dog dog2 = new Dog(true,6,"woefke",5, true);
        Dog dog3 = new Dog(true,9,"rexke",6, false);
        Monkey monkey1 = new Monkey(true,14,"boompje",7,true);
        Monkey monkey2 = new Monkey(false,2,"hangerke",8, false);
        Monkey monkey3 = new Monkey(true,5,"zwierke",9, false);

        myShelter.addAnimal(cat1);
        myShelter.addAnimal(cat2);
        myShelter.addAnimal(cat3);
        myShelter.addAnimal(dog1);
        myShelter.addAnimal(dog2);
        myShelter.addAnimal(dog3);
        myShelter.addAnimal(monkey1);
        myShelter.addAnimal(monkey2);
        myShelter.addAnimal(monkey3);

        System.out.println();
        myShelter.sortAnimalsByName();
        System.out.println("My sorted animals by name: ");
        myShelter.printAnimals();

        System.out.println("\nTo find the animal type name: ");
        Scanner myScanner = new Scanner(System.in);
        String animalName = myScanner.nextLine();
        System.out.println("Found your animal: " + myShelter.findAnimal(animalName.toLowerCase()));


        System.out.println("\nNr of animals registerd: " + myShelter.countAnimals() + "\n");

        System.out.println("Monkey vacinated for: " );
        monkey1.vaccinateAnimal(CHICKENPOCKS);
        System.out.println(monkey1.getIsVaccinated());
        System.out.println();
        myShelter.printAnimalsNotVaccinated(Disease.FLUE);
    }
}
