package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*FileReader fileReader = new FileReader(story[i]);
        BufferedReader buffReader.readLine(fileReader);*/

        String[] story = new String[3];

        story[0] = "goldilocks.txt";
        story[1] = "hansel_and_gretel.txt";
        story[2] = "mary_had_a_little_lamb.txt";

        //ask which story user wants to read
        System.out.println("What story would you like to read:");
        System.out.println("1) Goldilocks");
        System.out.println("2) Hansel and Gretel");
        System.out.println("3) Mary Had a Little Lamb");

        int userInput = scanner.nextInt();


        switch (userInput) {
            case 1:
                printStory(story[0]);
                break;
            case 2:
                printStory(story[1]);
                break;
            case 3:
                printStory(story[2]);
                break;
            default:
                System.out.println("Invalid command");
                break;
        }

    }

    public static void printStory(String fileName) {
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader buffReader = new BufferedReader(fileReader);
            String input;
            int lineNumber = 1;

            while((input = buffReader.readLine()) !=null){
                System.out.println(lineNumber + ". " + input);
                lineNumber++;
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }

}
