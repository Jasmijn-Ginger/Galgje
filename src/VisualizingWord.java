import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VisualizingWord {
    String word;
    int index;
    String letter;


    public void VisualizingWord (String word) {
        this.word = word;
        this.index = index;
        this.letter = letter;


    }

    public void visualize(String word) {

        String[] strArray = {};
        List<String> visualisedWordToBeGuessed = new ArrayList<>(Arrays.asList(strArray));
        for (int i = 0; i < word.length(); i++) {
            visualisedWordToBeGuessed.add("_ ");
        }
        for (String val : visualisedWordToBeGuessed) {
            System.out.print(val);
        }
    }

    public void updateLetters(int index, String letter){


    }

}

