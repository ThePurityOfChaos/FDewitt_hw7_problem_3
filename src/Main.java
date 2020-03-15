import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    System.out.println(Arrays.toString(autoComplete("h")));
        System.out.println(Arrays.toString(autoComplete("se")));
        System.out.println(Arrays.toString(autoComplete("sea")));
        System.out.println(Arrays.toString(autoComplete("ho")));
        System.out.println(Arrays.toString(autoComplete("xyz")));
    }

    public static String[] autoComplete(String input) {
        String[] setOfWords = {"hello", "high", "seattle", "seatac", "see", "hollow", "how"};
        char[][] setOfLetters = new char[setOfWords.length][]; //step 1
        for (int i = 0; i < setOfLetters.length; i++) {
            setOfLetters[i] = setOfWords[i].toCharArray();
        }
        char[] inputLetters = input.toCharArray(); //complete step 1
        int countOfRemaining = setOfWords.length;
        for (int i = 0; i < setOfLetters.length; i++) { //step 2
            for (int j = 0; j < inputLetters.length; j++) { //this is always going to be the size of the input, so it's not based on O(n). Weird.
                if (inputLetters[j] != setOfLetters[i][j]) {
                    setOfLetters[i] = null;
                    countOfRemaining--;
                    break;
                }
            }
        }//complete step 2
        String[] results = new String[countOfRemaining]; //step 3
        int preventNull = 0;
        for (int i = 0; i <setOfWords.length ; i++) {
            if(setOfLetters[i]!=null){
                results[preventNull]= String.valueOf(setOfLetters[i]);
                preventNull++;
            }
        }//complete step 3
        return results;
    }
}
