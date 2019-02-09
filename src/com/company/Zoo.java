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

    public void searchForPenAndAddAnimal(){
        System.out.println("Would you like to Add or Remove an Animal?");
                    System.out.println("1) Add Animal\n 2) Remove Animal");
                    int addOrRemoveAnimalOption = key.nextInt();
                    switch (addOrRemoveAnimalOption){
                        case 1:

                            break;
                        case 2:
                            break;
                        default:
                            break;
    }

}
