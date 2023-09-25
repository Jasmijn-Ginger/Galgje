import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HelloWorld.printHelloworld();


        //creating a new Galgje Word: wordToBeGuessed
        String wordToBeGuessed = CreateGalgjeWord.listOfWords[CreateGalgjeWord.random_int];
        System.out.println(wordToBeGuessed);
        System.out.println("The word you need to guess is " + wordToBeGuessed.length() + " letters long.");

        //number of tries
        int numberOfTries = 10;
        System.out.println("You have " + numberOfTries + " tries left.");

        //Player chooses letter: ChosenLetter
        Scanner ChooseALetter = new Scanner(System.in);
        System.out.print("Which letter do you want to guess? ");
        String ChosenLetter = ChooseALetter.next();


        //ChosenLetter is checked to see if it's valid
        // Later doen door Swing instelling Formatted Text Field

        //ChosenLetter is checked to see if it's in the wordToBeGuessed




    }
}

/*

GalgjeWord is set
There are 10 turns
ChosenLetter is given by Player


 */