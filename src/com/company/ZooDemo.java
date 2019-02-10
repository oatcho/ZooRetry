package com.company;

//import com.sun.java.util.jar.pack.Instruction;

import java.util.Scanner;

public class ZooDemo {

    public static void main(String[] args) {
	// write your code here
        Scanner key = new Scanner(System.in);
        Zoo welcomeToZoo = new Zoo();
        //should probably separate here for add pen function so can add new pens to same zoo above

        // break point before copy
        boolean menuLoop = true;

        System.out.println("Welcome to the Zoo! \n" +
                "Owned and Operated by Billy McFarland");

        do {
            System.out.println("Please choose an option \n" +
                    "1) Add or Remove a Pen \n" +
                    "2) Add or Remove an Animal \n" +
                    "3) See all Animals in the Zoo \n" +
                    "3) See all Animals in a Pen \n" +
                    "4) Leave Zoo");

            int userOption = key.nextInt();
            switch (userOption) {
                case 1:
                    System.out.println("Would you like to Add or Remove a Pen?");
                    System.out.println("1) Add Pen \n2) Remove Pen");
                    int addOrRemoveOption = key.nextInt();
                    switch (addOrRemoveOption){
                        case 1:
                            System.out.println("What would you like to name your new pen?");
                            key.nextLine();
                            String penName = key.nextLine();
                            Pen newPen = new Pen(penName);
                            welcomeToZoo.addPenToZoo(newPen);
                            break;
                        case 2:
                            welcomeToZoo.searchForPen();
                            break;
                        default:
                            System.out.println("Invalid Response");
                    }
                    break;
                case 2:
//                    System.out.println("Would you like to Add or Remove an Animal?");
//                    System.out.println("1) Add Animal\n 2) Remove Animal");
//                    int addOrRemoveAnimalOption = key.nextInt();
//                    switch (addOrRemoveAnimalOption){
//                        case 1:
//
//                            break;
//                        case 2:
//                            break;
//                        default:
//                            break;
                    welcomeToZoo.searchForPenAndAddAnimal();

                    break;
                case 3:
                    welcomeToZoo.printDetailsInPen();
                    break;
                case 4:
                    menuLoop = false;
                default:
                    System.out.println("Invalid response");
                    break;
            }

        } while (menuLoop);

    }
}
