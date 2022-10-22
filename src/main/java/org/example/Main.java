package org.example;
import java.util.Scanner;

public class Main{

    private static Scanner input;
    private static Square square;
    private static double firstSide = 0, secondSide = 0;

    public static void main(String[] args) {

        input = new Scanner(System.in);

        try {
            System.out.println("Input first variable:");
            firstSide = input.nextDouble();
            System.out.println("Input second variable:");
            secondSide = input.nextDouble();
        }
        catch(Exception e) {
            System.out.println("Illegal input");
        }


        square = new Square();
        System.out.println(square.pole(firstSide, secondSide));
        System.out.println(square.obwod(firstSide, secondSide));
        System.out.println(square.pole(firstSide, secondSide));
        System.out.println(square.obwod(firstSide, secondSide));
	
 	System.out.println(square.pole(firstSide, secondSide));
        System.out.println(square.obwod(firstSide, secondSide));



    }
}