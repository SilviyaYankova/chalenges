import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        // input example:
        // 5 5
        // c c - - -
        // c c - - -
        // - - - - -
        // - - - c c
        // - - - c c
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        String[][] arr = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scanner.next();
            }
        }
        System.out.println();
        int maxJumps = 0;
        int maxLength = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ("c".equals(arr[i][j])) {
                    System.out.print("u ");
                } else {
                    maxLength++;
                    if (maxLength == rows) {
                        maxJumps++;
                        maxLength = 0;
                    }
                    System.out.print("- ");
                }
            }
            maxLength = 0;
            System.out.println();
        }

        maxJumps++;
        System.out.println(maxJumps);
    }
}
