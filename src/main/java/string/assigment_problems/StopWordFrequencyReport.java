package string.assigment_problems;
import java.util.HashMap;
import java.util.Map;

public class StopWordFrequencyReport {

    static void printFilteredWordFrequency(String feedback) {

        String cleanedText = feedback.toLowerCase();

        cleanedText = cleanedText.replace(".", "");
        cleanedText = cleanedText.replace(",", "");

        String[] words = cleanedText.split("\\s+");

        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};

        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {

            boolean isStopWord = false;

            for (String stopWord : stopWords) {
                if (word.equals(stopWord)) {
                    isStopWord = true;
                    break;
                }
            }

            if (!isStopWord) {
                frequency.put(word, frequency.getOrDefault(word, 0) + 1);
            }
        }

        while (!frequency.isEmpty()) {

            String highestWord = "";
            int highestCount = 0;

            for (Map.Entry<String, Integer> entry : frequency.entrySet()) {

                if (entry.getValue() > highestCount) {
                    highestWord = entry.getKey();
                    highestCount = entry.getValue();
                }
            }

            System.out.println(highestWord + ": " + highestCount);

            frequency.remove(highestWord);
        }
    }

    public static void main(String[] args) {

        String feedback =
                "The mentor was great, the session was great and clear.";

        printFilteredWordFrequency(feedback);
    }
}