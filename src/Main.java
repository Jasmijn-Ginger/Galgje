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
        System.out.println("The word you need to guess is " + wordToBeGuessed.length() + " letters long.");

        //converting the wordToBeGuessed into an array: arrayWordToBeGuessed
        char[] arrayWordToBeGuessed = new char[wordToBeGuessed.length()];
        for (int i = 0; i < wordToBeGuessed.length(); i++) {
            arrayWordToBeGuessed[i] = wordToBeGuessed.charAt(i);
        }
//        Alleen van toepassing bij printen
//        for (char letterWordToBeGuessed : arrayWordToBeGuessed) {
//            System.out.println(letterWordToBeGuessed);
//        }

        //Visualising the word for the player
        String[] strArray = {};
        List<String> visualisedWordToBeGuessed = new ArrayList<>(Arrays.asList(strArray));
        for (int i = 0; i < wordToBeGuessed.length(); i++) {
            visualisedWordToBeGuessed.add("_ ");
        }
        for (String val : visualisedWordToBeGuessed) {
            System.out.print(val);
        }


        //number of tries
        int numberOfTriesLeft = 10;
        System.out.println("\nYou have " + numberOfTriesLeft + " tries left.");

        //Player chooses letter: chosenLetter
        Scanner ChooseALetter = new Scanner(System.in);
        System.out.print("Which letter do you want to guess? ");
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

            /*
            If letter in word:
            go through letters in arrayWordToBeGuessed
            compare to chosenLetter
            safe index
            replace same index of visualisedWordToBeGuessed with ChosenLetter
            go on with loop
            do numberOfTriesLeft -1
             */

//        for (char letterWordToBeGuessed : arrayWordToBeGuessed) {
//            if (letterWordToBeGuessed.equals(charChosenLetter)){
//
//            }
//        }


//        //Displaying the guessed letter in visualisedWordToBeGuessed


    }
}


/*

GalgjeWord is set
There are 10 turns
ChosenLetter is given by Player


 */