package controller;

import model.Triangle;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Triangle input() throws IOException {
        System.out.println("---Input value---");
        System.out.println("-----------------");
        System.out.print("Enter color of the triangle:");
        String color = br.readLine();
        System.out.print("Enter filled status (true/false):");
        Boolean filledStatus = new Boolean(br.readLine());
        int[] inputSide = new int[3];
        System.out.print("Enter side 1 of the triangle:");
        inputSide[0] = new Integer(br.readLine());
        System.out.print("Enter side 2 of the triangle:");
        inputSide[1] = new Integer(br.readLine());
        System.out.print("Enter side 3 of the triangle:");
        inputSide[2] = new Integer(br.readLine());
        Triangle newTriangle = new Triangle(color, filledStatus, inputSide[0], inputSide[1], inputSide[2]);
        return newTriangle;
    }
}
