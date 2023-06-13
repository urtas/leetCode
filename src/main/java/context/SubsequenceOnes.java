package context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubsequenceOnes {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt( bufferedReader.readLine());
        int maxCount = 0;
        int currentCount = 0;
        for (int i = 0; i < size; i++) {
            byte current = Byte.parseByte( bufferedReader.readLine());
            if (current == 0) {
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 0;
            } else {
                currentCount++;
            }

        }
        maxCount = Math.max(maxCount, currentCount);
        System.out.println(maxCount);
    }
}
