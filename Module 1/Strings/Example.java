package Strings;
public class Example {
    public static void main(String[] args) {
        String sentence = "Java programming is fun and educational";

        String searchWord = "fun";
        boolean containsWord = sentence.contains(searchWord);
        System.out.println("Does the sentence contain the word \"" + searchWord + "\"? " + containsWord);

        String newWordString = sentence.replace("educational","awesome");
        System.out.println("Updated sentence: " + newWordString);

        int largo = sentence.length();
        System.out.println("Length of the original sentence: " + largo);

        int maxLength = 17;
        String subSentence = sentence.substring(0, maxLength);
        System.out.println("Substring of the sentence: " + subSentence);

    }
}
