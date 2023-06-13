package context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubsequenceBrackets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bufferedReader.readLine());
        generateLine(0, 0, size, new StringBuilder());
    }

    private static void generateLine(int left, int right, int max, StringBuilder result) {
        if (left == max && right == max) {
            System.out.println(result);
            result.delete(1, result.length());
        } else {
            if (left < max) {
                generateLine(left + 1, right, max, result.append('('));
            }
            if (right < left) {
                generateLine(left, right + 1, max, result.append(')'));
            }
        }
    }
}
