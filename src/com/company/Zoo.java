package com.company;

import java.util.ArrayList;

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
}
