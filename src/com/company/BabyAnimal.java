package com.company;

public class BabyAnimal extends Animal {
    String birthDate;

    public BabyAnimal(String species, String size, String gender, String birthDate){
        super (species, size, gender);
        this.birthDate = birthDate;
    }

    public BabyAnimal(){

    }

    @Override
    public String toString() {
        return "Baby Animals{" +
                "species='" + species + '\'' +
                ", size='" + size + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
