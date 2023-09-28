import javax.swing.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {

        //Welcome message
        System.out.println("Welcome to Galgje! Please choose a letter to guess the word. You can make 10 mistakes until it is game over.");

        //creating a new Galgje Word: wordToBeGuessed
        String wordToBeGuessed = CreateGalgjeWord.listOfWords[CreateGalgjeWord.random_int].toUpperCase();
        System.out.println(wordToBeGuessed);

        //converting the wordToBeGuessed into an array: arrayWordToBeGuessed
        char[] arrayWordToBeGuessed = new char[wordToBeGuessed.length()];
        for (int i = 0; i < wordToBeGuessed.length(); i++) {
            arrayWordToBeGuessed[i] = wordToBeGuessed.charAt(i);
        }

        //Displaying word that needs to be guessed
        String[] displayedWord = new String[wordToBeGuessed.length()];
        for (int i = 0; i < wordToBeGuessed.length(); i++) {
            displayedWord[i] = "_";
        }

        //number of mistakes you can make
        int numberOfFaultsLeft = 10;

        //list of letters player has already guessed
        String[] guessedLetters = {};
        List<String> listGuessedLetters = new ArrayList<>(Arrays.asList(guessedLetters));


        //loop that keeps game going
        do {
            //Displaying the word in empty spaces and guessed letters
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

            //Checking if chosenLetter is already used
//            if (listGuessedLetters.contains(chosenLetter)){
//                System.out.println("You already guessed that letter");
//            }


            //Checking if the letter is in the wordToBeGuessed, and displaying message
            boolean LetterInWord = wordToBeGuessed.contains(chosenLetter);
            if (LetterInWord) {
                System.out.print("\nThe letter you chose is in the word :) ");
            } else {
                System.out.print("\nThe letter you chose is not in the word :( ");
                numberOfFaultsLeft -= 1;
            }

            //Checking where in the word the letter is and filling it in the display word
            for (int i = 0; i < arrayWordToBeGuessed.length; i++) {
                if (arrayWordToBeGuessed[i] == charChosenLetter) {
                    displayedWord[i] = chosenLetter;
                }
            }

            //Checking if game should continue, weather its won or lost
            if (!Arrays.asList(displayedWord).contains("_")){
                System.out.println("\nYou won! The word was: " + wordToBeGuessed);
                break;
            }
            if (numberOfFaultsLeft==0){
                System.out.println("\nGame over. The word was: " + wordToBeGuessed);
                break;
            }

            //number of tries
            System.out.println("You have " + numberOfFaultsLeft + " faults left.");

            //list of letters already guessed, displayed to player
            listGuessedLetters.add(chosenLetter);
            System.out.print("Letters you already guessed: ");
            for (String val : listGuessedLetters) {
                System.out.print(val + " ");
            }
            System.out.println();





        } while (Arrays.asList(displayedWord).contains("_") || numberOfFaultsLeft>0);





//        //Visualising the word for the player
//        VisualizingWord galgjeword = new VisualizingWord();
//        galgjeword.visualize(wordToBeGuessed);








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