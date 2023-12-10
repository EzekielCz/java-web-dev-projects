package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter radius: ");
        double radius = input.nextDouble();
        double areaOutput = Circle.getArea(radius);
        System.out.println("This is your area: "+areaOutput);

        input.close();
    }

}
