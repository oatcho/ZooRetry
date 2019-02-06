package com.company;

import java.util.Scanner;

public class ZooDemo {

    public static void main(String[] args) {
	// write your code here
        Scanner key = new Scanner(System.in);
        Zoo welcomeToZoo = new Zoo();
        //should probably separate here for add pen function so can add new pens to same zoo above
        System.out.println("What would you like to name your new pen?");
        String penName = key.nextLine();

        Pen newPen = new Pen(penName);

        welcomeToZoo.addPenToZoo(newPen);
        welcomeToZoo.printDetails();

    }
}
