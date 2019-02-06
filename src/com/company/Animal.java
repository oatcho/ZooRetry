package com.company;

public class Animal {
    String species;
    String size;
    String gender;

    public Animal (String species, String size, String gender){
        this.species = species;
        this.size = size;
        this.gender = gender;
    }

    public Animal(){

    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
