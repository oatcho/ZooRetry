package com.company;

public class BabyAnimal extends Animal {
    String birthDate;

    public BabyAnimal(String species, String size, String gender, String birthDate){
        super (species, size, gender);
        this.birthDate = birthDate;
    }

    public BabyAnimal(){

    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
