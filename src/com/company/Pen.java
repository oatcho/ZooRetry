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

    @Override
    public String toString() {
        return "Pen{" +
                "Collection of Animals:'" + listOfAnimals + '\'' +
                ", Collection of Baby Animals:'" + listOfBabyAnimals + '\'' +
                '}';
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

    public void printDetailsInPen2(){
        for(int i = 0; i < listOfAnimals.size(); i++) {
            for(int j = 0; j < listOfBabyAnimals.size(); j++) {
                System.out.println(listOfAnimals.get(i).species + listOfBabyAnimals.get(j).species);
            }
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
