package by.kasyan.tasks.lesson8.task2;

public class TextFormater {

    static int calculatingWords(String sentence) {
        int numWords = 0;
        for (int i = 0; i < sentence.length(); i++) {
            numWords++;
        }
        return numWords;
    }

    static boolean calculatingPalindrome(String sentence) {
        String[] words = sentence.split(" ");
        for (String word : words) {
            StringBuffer buffer = new StringBuffer(word);
            buffer.reverse();
            if (word.equals(buffer.toString())) {
                return true;
            }
        }
        return false;
    }
}