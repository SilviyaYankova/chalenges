import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        // input example:
        // c o d e w a r s
        // h a c k e r r a n k
        Scanner scanner = new Scanner(System.in);
        String[] inputFirstWord = scanner.nextLine().split(" ");
        String[] inputSecondWord = scanner.nextLine().split(" ");

        Map<String, Integer> firstWord = new LinkedHashMap<>();
        Map<String, Integer> secondWord = new LinkedHashMap<>();
        fillMap(inputFirstWord, firstWord);
        fillMap(inputSecondWord, secondWord);

        int crossedLettersCount = 0;
        Iterator<Map.Entry<String, Integer>> firstWordIterator = firstWord.entrySet().iterator();
        while (firstWordIterator.hasNext()) {
            Map.Entry<String, Integer> first = firstWordIterator.next();
            String key = first.getKey();
            if (!secondWord.containsKey(key)) {
                firstWordIterator.remove();
                crossedLettersCount += first.getValue();
            }
        }

        Iterator<Map.Entry<String, Integer>> secondWordIterator = secondWord.entrySet().iterator();
        while (secondWordIterator.hasNext()) {
            Map.Entry<String, Integer> second = secondWordIterator.next();
            String key = second.getKey();
            if (!firstWord.containsKey(key)) {
                secondWordIterator.remove();
                crossedLettersCount += second.getValue();
            } else {
                int valueOfTheFirst = firstWord.get(key);
                int valueOfTheSecond = second.getValue();
                if (valueOfTheFirst < valueOfTheSecond) {
                    int diff = valueOfTheSecond - valueOfTheFirst;
                    secondWord.put(key, secondWord.get(key) - diff);
                    crossedLettersCount += diff;
                } else if (valueOfTheFirst > valueOfTheSecond) {
                    int diff = valueOfTheFirst - valueOfTheSecond;
                    firstWord.put(key, firstWord.get(key) - diff);
                    crossedLettersCount += diff;
                }
            }
        }
        System.out.println("Result: " + crossedLettersCount);
    }

    private static void fillMap(String[] word, Map<String, Integer> map) {
        for (String letter : word) {
            map.putIfAbsent(letter, 0);
            map.put(letter, map.get(letter) + 1);
        }
    }
}
