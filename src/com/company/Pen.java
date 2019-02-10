package com.company;

import java.util.ArrayList;

public class Pen {

    ArrayList<Animal> listOfAnimals = new ArrayList<>();
    ArrayList<BabyAnimal> listOfBabyAnimals = new ArrayList<>();
    String penName;

    public Pen(ArrayList<Animal> listOfAnimals, ArrayList<BabyAnimal> listOfBabyAnimals, String penName) {
        this.listOfAnimals = listOfAnimals;
        this.listOfBabyAnimals = listOfBabyAnimals;
        this.penName = penName;
    }

    public Pen(String penName) {
        this.listOfAnimals = listOfAnimals;
        this.listOfBabyAnimals = listOfBabyAnimals;
        this.penName = penName;
    }

    public Pen(){

    }

    public String getPenName() {
        return penName;
    }

    public void printDetailsInPen(){
        for (Animal a : listOfAnimals){
            System.out.println(a);
        }
        for (BabyAnimal b : listOfBabyAnimals){
            System.out.println(b);
        }
    }

    public void setPenName(String penName) {
        this.penName = penName;
    }

    public ArrayList<Animal> getListOfAnimals() {
        return listOfAnimals;
    }

    public void setListOfAnimals(ArrayList<Animal> listOfAnimals) {
        this.listOfAnimals = listOfAnimals;
    }

    public ArrayList<BabyAnimal> getListOfBabyAnimals() {
        return listOfBabyAnimals;
    }

    public void setListOfBabyAnimals(ArrayList<BabyAnimal> listOfBabyAnimals) {
        this.listOfBabyAnimals = listOfBabyAnimals;
    }

    public void addAnimalToPen(Animal newAnimal){
        listOfAnimals.add(newAnimal);
    }
}
