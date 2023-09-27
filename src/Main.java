import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        //Welcome message
        System.out.println("Welcome to Galgje! Please choose a letter to guess the word. You can make 10 mistakes untill it is game over.");


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

        int numberOfFaultsLeft = 10;

        String[] guessedLetters = {};
        List<String> listGuessedLetters = new ArrayList<>(Arrays.asList(guessedLetters));
//        listGuessedLetters.add("Boston");
//        for(String val : listGuessedLetters) {
//            System.out.print(val + " ");
//        }

        for (String some : displayedWord) {
            //while there are still unguessed letters
            while (some.equals("_")) {
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


                //Checking if the letter is in the wordToBeGuessed, and displaying message
                boolean LetterInWord = wordToBeGuessed.contains(chosenLetter);
                if (LetterInWord) {
                    System.out.println("You choose letter: " + charChosenLetter + ". The letter you chose is in the word :)");
                } else {
                    System.out.println("You choose letter: " + charChosenLetter + ". The letter you chose is not in the word :(");
                    numberOfFaultsLeft -= 1;

                }

                //number of tries
                System.out.println("You have " + numberOfFaultsLeft + " faults left.");

                //list of letters already guessed, displayed to player
                listGuessedLetters.add(chosenLetter);
                System.out.print("Letters you already guessed: ");
                for(String val : listGuessedLetters) {
                    System.out.print(val + " ");
                }
                System.out.println();


                //Checking where in the word the letter is and filling it in the display word
                for (int i = 0; i < arrayWordToBeGuessed.length; i++) {
                    if (arrayWordToBeGuessed[i] == charChosenLetter){
                        displayedWord[i] = chosenLetter;
                    }
                }




            }

        }



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