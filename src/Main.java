import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {

        //creating a new Galgje Word: wordToBeGuessed
        String wordToBeGuessed = CreateGalgjeWord.listOfWords[CreateGalgjeWord.random_int].toUpperCase();
        System.out.println(wordToBeGuessed);

        //converting the wordToBeGuessed into an array: arrayWordToBeGuessed
        char[] arrayWordToBeGuessed = new char[wordToBeGuessed.length()];
        for (int i = 0; i < wordToBeGuessed.length(); i++) {
            arrayWordToBeGuessed[i] = wordToBeGuessed.charAt(i);
        }


        String[] displayedWord = new String[wordToBeGuessed.length()];
        for (int i = 0; i < wordToBeGuessed.length(); i++) {
            displayedWord[i] = "_";
        }

        for (String i : displayedWord) {
            while (i.equals("_")) {
                System.out.println("jeej");
            }
        }

        //number of tries
        int numberOfTriesLeft = 10;
        System.out.println("You have " + numberOfTriesLeft + " tries left.");

//        //Visualising the word for the player
//        VisualizingWord galgjeword = new VisualizingWord();
//        galgjeword.visualize(wordToBeGuessed);

        for (int i = 0; i < wordToBeGuessed.length(); i++) {
            System.out.print(displayedWord[i]);
        }

        //Player chooses letter: chosenLetter
        Scanner ChooseALetter = new Scanner(System.in);
        System.out.print("\nWhich letter do you want to guess? ");
        String chosenLetter = ChooseALetter.next().toUpperCase();

        //chosenLetter is checked to see if it's valid
        // Later doen door Swing instelling Formatted Text Field

        //String chosenLetter converting to char
        char charChosenLetter = chosenLetter.charAt(0);
        System.out.println("You choose letter: " + charChosenLetter);


        //Checking if the letter is in the wordToBeGuessed, and displaying message
        boolean LetterInWord = wordToBeGuessed.contains(chosenLetter);
        if (LetterInWord) {
            System.out.println("The letter you chose is in the word :)");
        } else {
            System.out.println("The letter you chose is not in the word :(");
        }


        //Checking where in the word the letter is
        for (int i = 0; i < arrayWordToBeGuessed.length; i++) {
            if (arrayWordToBeGuessed[i] == charChosenLetter){
                displayedWord[i] = chosenLetter;
            }
        }
        //printing the displayed word
        for (int i = 0; i < wordToBeGuessed.length(); i++) {
            System.out.print(displayedWord[i]);
        }





    }
}


/*

GalgjeWord is set
There are 10 turns
ChosenLetter is given by Player


 */

  /*
            If letter in word:
            go through letters in arrayWordToBeGuessed
            compare to chosenLetter
            safe index
            replace same index of visualisedWordToBeGuessed with ChosenLetter
            go on with loop
            do numberOfTriesLeft -1
             */
//Displaying the guessed letter in visualisedWordToBeGuessed