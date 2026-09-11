package string.assigment_problems;
public class WordReversalEncoder {

    static String reverseEachWord(String sentence) {

        String[] words = sentence.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {

            StringBuilder reversed = new StringBuilder(words[i]);
            reversed.reverse();

            result = result + reversed;

            if (i < words.length - 1) {
                result = result + " ";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String sentence = "hello club";

        String output = reverseEachWord(sentence);

        System.out.println(output);
    }
}