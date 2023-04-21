import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        // input example:
        // Color: 10
        // Color: 7
        // Color: 9
        // Color: 1
        // End
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Integer> list = new ArrayList<>();
        while (!"End".equals(input)) {
            String[] split = input.split(": ");
            list.add(Integer.parseInt(split[1]));
            input = scanner.nextLine();
        }

        int maxCount = list.get(0);
        int countOfBallsToTakeOut = 0;
        for (int i = 1; i < list.size(); i++) {
            int temp = list.get(i);
            if (maxCount > temp) {
                countOfBallsToTakeOut += temp;
            } else {
                countOfBallsToTakeOut += maxCount;
                maxCount = temp;
            }
        }

        if (list.size() == 1) {
            System.out.println("There is only one color in the box.");
        } else {
            System.out.println("Smallest count of balls: " + countOfBallsToTakeOut);
        }
    }
}