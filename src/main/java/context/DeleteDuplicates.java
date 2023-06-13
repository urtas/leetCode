package context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DeleteDuplicates {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt( bufferedReader.readLine());
        List<Integer> result = new ArrayList<>();
        int index = -1;
        for (int i = 0; i < size; i++) {
            int currentNumber = Integer.parseInt( bufferedReader.readLine());
            if (index == -1 || result.get(index) < currentNumber) {
                index++;
                result.add(currentNumber);
            }
        }
        for (Integer integer : result) {
            System.out.println(integer);
        }
    }
}
