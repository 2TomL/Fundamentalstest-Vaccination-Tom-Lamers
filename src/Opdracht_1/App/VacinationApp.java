package Opdracht_1.App;

import Opdracht_1.*;

import java.util.Optional;
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

        // dieren gesorteerd per naam
        System.out.println();
        myShelter.sortAnimalsByName();
        System.out.println("My sorted animals by name: ");
        myShelter.printAnimals();

        //aantal dieren geregistreerd
        System.out.println("\nNr of animals registerd: " + myShelter.countAnimals() + "\n");

        //Hier checken we of het dier is gevacineerd of niet voor iets
        System.out.println("Monkey vacinated for: " );
        monkey1.vaccinateAnimal(CHICKENPOCKS);
        System.out.println(monkey1.getIsVaccinated());
        System.out.println();

        // lijst dieren die niet gevacineerd zijn voor een bepaalde ziekte
        myShelter.printAnimalsNotVaccinated(Disease.FLUE);

        //Geeft het oudste dier weer
        System.out.println("\nThe oldest stinker is: " + myShelter.findOldestAnimal());

        //De dierenzoeker
        System.out.println("\nTo find the animal type name: ");
        Scanner myScanner = new Scanner(System.in);
        String animalName = myScanner.nextLine();
        System.out.println("Found your animal: " + myShelter.findAnimal(animalName.toLowerCase()));
        System.out.println("\nTo find the animal type nr: ");
        int animalNr = myScanner.nextInt();
        System.out.println("Found your animal: " + myShelter.findAnimal(animalNr));

        //print het opgeven van een int (nr) or string (name)
        System.out.print("\nEnter the animal nr or name: ");
        if (myScanner.hasNextInt()) {
            int myAnimalNr = myScanner.nextInt();
            Optional<Animal> animal = myShelter.findAnimal(myAnimalNr);
            if (animal.isPresent()) {
                System.out.println("The animal with nr " + myAnimalNr + " is: " + animal.get());
            } else {
                System.out.println("No animal with nr " + myAnimalNr + " was found.");
            }
        } else {
            String myAnimalName = myScanner.next().toLowerCase();
            Optional<Animal> animal = myShelter.findAnimal(myAnimalName);
            if (animal.isPresent()) {
                System.out.println("The animal with name " + myAnimalName + " is: " + animal.get());
            } else {
                System.out.println("No animal with name " + myAnimalName + " was found.");
            }
        }
    }
}
