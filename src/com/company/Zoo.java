package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo extends Pen {

    public ArrayList<Pen> zooArray = new ArrayList<>();

    public Zoo(ArrayList<Animal> listOfAnimals, ArrayList<BabyAnimal> listOfBabyAnimals,String penName, ArrayList<Pen> zooArray) {
        super(listOfAnimals, listOfBabyAnimals, penName);
        this.zooArray = zooArray;
    }

    public Zoo(){

    }

    public ArrayList<Pen> getZooArray() {
        return zooArray;
    }

    public void setZooArray(ArrayList<Pen> zooArray) {
        this.zooArray = zooArray;
    }

    public void addPenToZoo(Pen newPen){
        zooArray.add(newPen);
    }

    public void removePenFromZoo(Pen penToDelete){
        zooArray.remove(penToDelete);
    }

    public void printDetails(){
        for(Pen a : zooArray){
            System.out.println(a);
        }
    }

    public void searchForPen(){
        Scanner searchScanner = new Scanner(System.in);
        System.out.println("Enter the name of the pen you would like to remove.");
        String searchInput = searchScanner.nextLine();
        boolean penFound = false;
        for (int i = 0; i < zooArray.size(); i++) {
            if (zooArray.get(i).getPenName().equalsIgnoreCase(searchInput)) {
                penFound = true;
                System.out.println("Pen Found! Are you sure you would like to remove this Pen? \n 1) Yes, remove Pen. \n 2) Cancel & Exit");
                int searchMenuOption = searchScanner.nextInt();
                if (searchMenuOption == 1){
                    zooArray.remove(i);
                } else {
                    penFound = false;
                }
            }

        }
        if (!penFound) {
            System.out.println("That pen doesn't exist.");
        }
    }

    public void searchForPenAndAddAnimal() {
        Scanner key = new Scanner(System.in);
        System.out.println("Would you like to Add or Remove an Animal or a BabyAnimal?");
        System.out.println("1) Animal\n 2) BabyAnimal");
        int animalOrBabyAnimal = key.nextInt();
        if (animalOrBabyAnimal == 1){
            System.out.println("Would you like to Add or Remove an Animal?\n 1) Add Animal to a Pen \n 2) Remove Animal from Pen");
        int addOrRemoveAnimalOption = key.nextInt();
        switch (addOrRemoveAnimalOption) {
            case 1:
                System.out.println("Please enter the Animal's Species: ");
                key.nextLine();
                String species = key.nextLine();
                System.out.println("How large is the Animal?");
                String size = key.nextLine();
                System.out.println("Is this Animal a male or female?");
                String gender = key.nextLine();
                Animal newAnimalObject = new Animal(species, size, gender);
                System.out.println("What's the name of the Pen you would like to add this animal to?");
                String nameOfPenIWannaAddTo = key.nextLine();
                boolean penFound = false;
                for (int i = 0; i < zooArray.size(); i++) {
                    if (zooArray.get(i).getPenName().equalsIgnoreCase(nameOfPenIWannaAddTo)) {
                        penFound = true;
                            listOfAnimals.add(newAnimalObject);
                        } else {
                            penFound = false;
                        }
                    }
                if (!penFound) {
                    System.out.println("That pen doesn't exist.");
                }
                break;
            case 2:
                break;
//            default:
//                break;
        }
        } else if(animalOrBabyAnimal == 2){
            //copy and paste animal stuff
        }
    }


}
