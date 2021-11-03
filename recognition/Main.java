package recognition;
import java.util.*;

public class Main {
    private static final int[][] weights = {{2, 1, 2}, {4, -4, 4}, {2, -1, 2}};
    private static final int bias = -5;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] image = new int[3][3];

        for (int row = 0; row < 3; row++) {
            String[] input = scanner.nextLine().split("");
            for (int col = 0; col < 3; col++) {
                image[row][col] = input[col].equals("X") ? 1 : 0;
            }
        }

        int output = bias;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                output += image[row][col] * weights[row][col];
            }
        }

        System.out.printf("This number is %d", output < 0 ? 1 : 0);
    }
}
