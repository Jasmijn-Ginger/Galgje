import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HelloWorld.printHelloworld();


        //creating a new Galgje Word: wordToBeGuessed
        String wordToBeGuessed = CreateGalgjeWord.listOfWords[CreateGalgjeWord.random_int].toUpperCase();
        System.out.println(wordToBeGuessed);
        System.out.println("The word you need to guess is " + wordToBeGuessed.length() + " letters long.");

        //Visualising the word for the player
        String cube = " [ ] ";
        String progressWordToBeGuessed = cube.repeat(wordToBeGuessed.length());
        System.out.println(progressWordToBeGuessed);


        //number of tries
        int numberOfTriesLeft = 10;
        System.out.println("You have " + numberOfTriesLeft + " tries left.");

        //Player chooses letter: chosenLetter
        Scanner ChooseALetter = new Scanner(System.in);
        System.out.print("Which letter do you want to guess? ");
        String chosenLetter = ChooseALetter.next().toUpperCase();


        //chosenLetter is checked to see if it's valid
        // Later doen door Swing instelling Formatted Text Field


        //chosenLetter is checked to see if it's in the wordToBeGuessed
        /*
        Loop door de letters heen van wordToBeGuessed,
        check of die gelijk zijn met chosenLetter
        sla de index daarvan op
        geef een boodschap weer
        vervang de lege plekken op progressWordToBeGuessed met de chosenLetter
        doe numberOfTriesLeft - 1
         */



        boolean LetterInWord = wordToBeGuessed.contains(chosenLetter);
        if (LetterInWord) {
            System.out.println("The letter you chose is in the word :)");
            int index = wordToBeGuessed.indexOf(chosenLetter);
            while (index != -1) {
                System.out.println(index);
                index = wordToBeGuessed.indexOf(chosenLetter, index + 1);
            }

        }
        else {
            System.out.println("The letter you chose is not in the word :(");
            }






    }
}

/*

GalgjeWord is set
There are 10 turns
ChosenLetter is given by Player


 */