package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args){
        //declaring variables
        String adjective;
        String season_year;
        int number;

        //importing scanner
        Scanner scanner = new Scanner(System.in);

        //asking input from the user
        System.out.println("Write an adjective: ");
        adjective = scanner.next();

        System.out.println("Write a season of the year: ");
        season_year = scanner.next();

        System.out.println("Write a whole number: ");
        number = scanner.nextInt();

        scanner.close();

        //text
        System.out.println("Once upon a time, there was " +
                "a king called James. He was very " + adjective +
                ". During " + season_year + " he went to the beach with his " + number + " dogs." );
    }
}

